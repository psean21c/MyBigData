
#

```
1) Verify the table already existing in DB
 table : phx_user
 
2) Implement source code

3) Run the instruction in bitBucket
$./gradlew bootRun

4) swagger-ui
http://localhost:10700/swagger-ui.html

```

| Layer       | Files         | 
| ------------- |:-------------:| 
| Resource      | Resource  | 
|Service     |  Service / ServiceImpl    | 
| Repository      | Repository      | 
| DB | POJO + POJODTO + Mapper / MapperImpl     | 

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
```
CREATE TABLE phx_users
(Id bigint identity NOT NULL,
email varchar(255) NOT NULL,
first_name varchar(255) NOT NULL,
last_name varchar(255) NOT NULL
)
```
