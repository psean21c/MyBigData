# application.properties
```
# SQL Server
spring.jpa.hibernate.ddl-auto=create
spring.datasource.url=jdbc:sqlserver://devsql001.autocapitalcanada.local:1433;databaseName=cccdev03;
spring.datasource.username=cccapp
spring.datasource.password=xxxx

#My SQL
spring.jpa.hibernate.ddl-auto=create
spring.datasource.url=jdbc:mysql://localhost:3306/greeting
spring.datasource.username=root
spring.datasource.password=xxxx
```

# curl
```
curl 'localhost:8080/demo/add?secondname=Simon&email=someemail@someemailprovider.com'
curl 'localhost:8080/demo/all'
```
=================

Reference

https://spring.io/guides/gs/accessing-data-mysql/


Cannot load driver class: com.microsoft.sqlserver.jdbc.SQLServerDriver

http://stackoverflow.com/questions/27967216/could-not-load-jdbc-driver-class-spring-batch-standalone-program
