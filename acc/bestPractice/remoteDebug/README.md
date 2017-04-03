
# ACC Project

### DB Setup
```
1) DB Start
sudo /usr/local/mysql/support-files/mysql.server start
sudo /usr/local/mysql/support-files/mysql.server stop

2) Create Table
Create table AppsForImport
(
ID BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
DT_ApplicationNumber varchar(50)
)
/
** AUTO_INCREMENT : My SQL
IDENTITY : SQL Server

```

### Eclipse
```
1) Create Gradle project in Eclipse
  serve-jdbc-mysql
2) Copy & replace default build file by acc's build.gradle
  build.gradle
  gradle.properties
  gradle/ 9 gradle files..

3) Refresh Gradle Project
 >> At this point, you should be able to see all dependending jar files under the library folder 
   [Project and External Dependencies]
4)
```
