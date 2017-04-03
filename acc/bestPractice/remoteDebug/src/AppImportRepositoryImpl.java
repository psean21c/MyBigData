package com.ccc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;


@Repository
public class AppImportRepositoryImpl implements AppImportRepository {

  @Autowired
  private JdbcOperations jdbc;

  private static final String SQL_INSERT = "insert into AppsForImport(DT_ApplicationNumber) values(?)";

  private static final String SQL_UPDATE = "update AppsForImport set DT_ApplicationNumber=? where id=?";
  private static final String SQL_FIND_ONE = "select * from AppsForImport where id=?";
  private static final String SQL_FIND_ALL = "select * from AppsForImport order by DT_ApplicationNumber";
  private static final String SQL_DELETE_ONE = "delete from AppsForImport where id =?";


  @Override
  public AppImport findOne(Long id) {
    return jdbc.queryForObject(SQL_FIND_ONE, new AppImportRowMapper(), id);
  }

  @Override
  public AppImport save(AppImport app) {
    KeyHolder holder = new GeneratedKeyHolder();

    int rows = jdbc.update(new PreparedStatementCreator() {
      @Override
      public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
        PreparedStatement ps = con.prepareStatement(SQL_INSERT, new String[] {""});

        ps.setString(1, app.getAppNumber());

        return ps;
      }
    }, holder);

    if (rows == 1) {
//      BigDecimal bigDec = (BigDecimal)holder.getKey();
//      System.out.println("\n\n==================" + holder.getKey() + "\n\n" + bigDec);
//      Long idx = new Long(bigDec.toString().trim());
      Long idx =(Long) holder.getKey();
      app.setId(idx);
      return app;
    }
    return null;
  }

  @Override
  public List<AppImport> findAll() {
    return jdbc.query(SQL_FIND_ALL, new AppImportRowMapper());
  }

  @Override
  public int update(AppImport app) {
    return jdbc.update(SQL_UPDATE, app.getAppNumber(), app.getId());
  }

  @Override
  public int delete(AppImport app) {
    return jdbc.update(SQL_DELETE_ONE, app.getId());
  }

  private class AppImportRowMapper implements RowMapper<AppImport> {
    @Override
    public AppImport mapRow(ResultSet rs, int row) throws SQLException {
      return new AppImport(rs.getLong("id"), rs.getString("DT_ApplicationNumber"));
    }

  }

}
