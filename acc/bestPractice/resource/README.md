
#

### Steps to create micro-service using JHipster

```
1) Ensure that Dev. enviornment is ready
 - Need to install JDK8 / gradle / JHipster / DB
 - DB table for this practice : phx_user
 
2) Run jhipster
$yo jhipster
$./gradlew

3) Add a template / Update configuration
- Import project into your editor 
- Implement source code
- Configure application-dev.yml
  : eureka endpoiint
  : DB connection

4) 

5) Run the instruction in bitBucket
$./gradlew bootRun

6) swagger-ui
http://localhost:10700/swagger-ui.html

```

* Layout for the file 

| Layer       | Files         | Examples|
| ------------- |:-------------:| :-------------:| 
| Data (POJO) | User.java  | com.ccc.domain | 
| DTO | UserDTO.java    | com.ccc.domain | 
| Repository      | UserRepository.java     | com.ccc.repository |
|Service     |  UserService.java / UserServiceImpl.java    |com.ccc.service | 
| Mapper | UserMapper.java /UserMapperImpl.java     | com.ccc.service | 
| Resource      |  UserResource.java  | com.ccc.web.rest|


* Trouble shoot 
```
Caused by: org.springframework.web.client.ResourceAccessException: 
I/O error on GET request for "http://localhost:8761/config/gateway/dev/master": Connection refused (Connection refused);
nested exception is java.net.ConnectException: Connection refused (Connection refused)

=> Either you need to check 
(1) if the JHipster registry server is up (http://{IP}:8761/)
or (2) JHipster URL was properly configured in yml file
```



* How to configure yml file 
```yml
#aplication-dev.yml file 

# in order to register a service JHipster Registry
eureka:
    instance:
        prefer-ip-address: true
    client:
        enabled: true               # must be .. enabled == true
        healthcheck:
            enabled: true
        registerWithEureka: true
        fetchRegistry: true
        serviceUrl:
            defaultZone: http://admin:admin@localhost:8761/eureka/  # Update password with admin for test purpose

# in order to connect DB
spring:
    profiles:
        active: dev
        include: swagger
    ... # omitted
    datasource:
        type: com.zaxxer.hikari.HikariDataSource
        url: jdbc:sqlserver://devsql001.autocapitalcanada.local:1433;databaseName=cccdev03;
        name:
        username: cccapp
        password: cccapp
        hikari:
            data-source-properties:
                cachePrepStmts: true
                prepStmtCacheSize: 250
                prepStmtCacheSqlLimit: 2048
                useServerPrepStmts: true
    jpa:
        database-platform: org.hibernate.dialect.SQLServer2012Dialect
        database: SQL_SERVER
        show-sql: true
        #hibernate:
        #    ddl-auto: create-drop
        properties:
            hibernate.cache.use_second_level_cache: false
            hibernate.cache.use_query_cache: false
            hibernate.generate_statistics: true            
```

SQL to create table
```mysql
# MS(MicroSoft) SQL
CREATE TABLE phx_users
(Id bigint identity NOT NULL,
email varchar(255) NOT NULL,
first_name varchar(255) NOT NULL,
last_name varchar(255) NOT NULL
)

# MySQL
CREATE TABLE phx_users
(Id bigint AUTO_INCREMENT NOT NULL,
email varchar(255) NOT NULL,
first_name varchar(255) NOT NULL,
last_name varchar(255) NOT NULL,
PRIMARY KEY (id)
);

# Insert sample data
insert into phx_users(email,first_name,last_name) values('abc@gmail.com','simon','park')

```
