package com.ccc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.datasource.SingleConnectionDataSource;


@Configuration
@ComponentScan
public class Config {

  @Bean
  public DataSource dataSource() {
//       1) H2
//    import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
//    import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
//      DataSource dataSource = new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).addScript("schema.sql").build();
          
//     2) SQL Server connection
//    import org.springframework.jdbc.datasource.SingleConnectionDataSource;
     SingleConnectionDataSource dataSource = new SingleConnectionDataSource();
     String driverClassName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
     dataSource.setDriverClassName(driverClassName);
     dataSource.setUrl("jdbc:sqlserver://devsql001.autocapitalcanada.local:1433;databaseName=cccdev03");
     dataSource.setUsername("cccapp");
     dataSource.setPassword("cccapp");
    
     return dataSource;
  }
  
  @Bean
  public JdbcOperations jdbcTemplate(DataSource ds){
    return new JdbcTemplate(ds);
    
  }
}
