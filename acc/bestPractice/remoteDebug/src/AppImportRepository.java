package com.ccc;

import java.util.List;

public interface AppImportRepository {
  
  AppImport findOne(Long id);
  
  AppImport save(AppImport app);
  
  List<AppImport> findAll();
  
  int update(AppImport app);
  
  int delete(AppImport app);
  
}
