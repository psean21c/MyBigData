
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
   
4) Copy source java file under the folder - src/main/java/com/ccc

5) Run as [Spring Boot App] & Check the result
Spring App started !!
...
1 : DT0001
...
Finished . Spring Context will be closed

```

### Build and Run the App

```
1) Go to the project folder
 $ cd {serve-jdbc-mysql}
 
2) build
 $ gradle clean build
  >> the folder [build] will be created 
3) Go to the libs
$cd build/libs

4) run the jar & Check the result
$ java -jar serve-jdbc-mysql-0.0.1-SNAPSHOT.jar
 
```

### Remote Debug
```
1) run
// Move file to the server
$ scp abc.txt spark@prodcccapp01.autocapitalcanada.local:/home/spark/

// syntax
$ java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=y -jar abc.jar

$ java -jar -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=y build/libs/serve-jdbc-mysql-0.0.1-SNAPSHOT.jar

* refer to 72.6 Set the active Spring profiles in the [SpringBoot]

2) Attach source file in Eclipse
 - Right click on the project
 - Debug As > Debug Configurations > 
 - Go to [Remote Java Application] and right click [New]
 - Check Port # is the same as 8000 above, 
 - Apply > Debug
 
3) You should be able to debug / trace source code..
 
 
```

[SpringBoot](http://docs.spring.io/autorepo/docs/spring-boot/current/reference/htmlsingle/#howto-set-active-spring-profiles)


[Reference](http://javapapers.com/core-java/java-remote-debug-with-eclipse/)

