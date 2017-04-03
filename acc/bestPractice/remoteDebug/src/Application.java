package com.ccc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

  public static void main(String[] args) {
    callInovatecDB();
  }

  static void callInovatecDB() {

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
    AppImportRepository repo = ctx.getBean(AppImportRepository.class);

    System.out.println("Spring App started !!");
    
    AppImport app = new AppImport("DT0001");
    app = repo.save(app);

    for (AppImport t : repo.findAll()) {
      System.out.println(t.getId() + " : " + t.getAppNumber());
    }

    System.out.println("Finished . Spring Context will be closed");

    ctx.close();

  }
}
