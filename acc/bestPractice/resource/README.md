
#

### Steps to create micro-service using JHipster

```
1) Ensure that Dev. enviornment is ready
 - Need to install JDK8 / gradle / JHipster / DB
 - DB table for this practice : phx_user
 
2) Run jhipster
$yo jhipster
$./gradlew

3) Add a  
- Import project into your editor 
- Implement source code

4) Run the instruction in bitBucket
$./gradlew bootRun

4) swagger-ui
http://localhost:10700/swagger-ui.html

```

| Layer       | Files         | Examples|
| ------------- |:-------------:| :-------------:| 
| Data | POJO  |User.java | 
| DTO | DTO    |UserDTO.java | 
| Resource      | Resource  |  UserResource.java|
|Service     |  Service / ServiceImpl    | UserService.java / UserServiceImpl.java| 
| Repository      | Repository      | UserRepository.java |
| Mapper | Mapper / MapperImpl     |UserMapper.java /UserMapperImpl.java | 


```
com.ccc.domain                                // User.java
com.ccc.repository                           // UserRepository.java
com.ccc.service                                // UserService.java
com.ccc.service.impl                        // UserServiceImpl.java
com.ccc.service.dto                         // UserDTO.java
com.ccc.service.mapper                  // UserMapper.java
com.ccc.service.mapper.impl          // UserMapperImpl.java
com.ccc.web.rest                              // UserResource.java
```


select * from phx_document_metadata_document
where applicant_id = '168' and application_id = '42'

* How to register service in JHipster ??
```
#aplication.yml file : must be .. enabled == true
eureka:
    instance:
        prefer-ip-address: true
    client:
        enabled: true
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
