
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
