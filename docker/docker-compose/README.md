
```
toraccmac001:docker$ ls -al
total 8
drwxr-xr-x   3 toraccmac001  staff  102 24 Apr 09:47 .
drwxr-xr-x  15 toraccmac001  staff  510 24 Apr 09:44 ..
-rw-r--r--   1 toraccmac001  staff  216 24 Apr 09:47 docker-compose.yml

toraccmac001:docker$ docker-compose up
ERROR: yaml.scanner.ScannerError: while scanning for the next token
found character '\t' that cannot start any token
  in "./docker-compose.yml", line 3, column 1
>> Use space, not tab

toraccmac001:docker$ docker-compose up
ERROR: Version in "./docker-compose.yml" is invalid - it should be a string.
>> "2" not 2

toraccmac001:docker$ docker-compose up
ERROR: In file './docker-compose.yml', service 'environment' must be a mapping not an array.
>> indentation for environment

516 toraccmac001:docker$ vi docker-compose.yml 

```

```yaml
version: "2"
services:
   databases:
      image: mysql
      ports:
      - "3306:3306"
      environment:
      - MYSQL_ROOT_PASSWORD=password
      - MYSQL_USER=user
      - MYSQL_PASSWORD=password
      - MYSQL_DATABASE=demodb
   web:
      image: nginx

```
