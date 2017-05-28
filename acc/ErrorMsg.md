
# Server 

* permission denied for docker
```shell

+ ./gradlew buildDocker -x test
:buildDockerGot permission denied while trying to connect to the Docker daemon socket at unix:///var/run/docker.sock: 
Post http://%2Fvar%2Frun%2Fdocker.sock/v1.28/build?buildargs=%7B%7D&cachefrom=%5B%5D&cgroupparent=&cpuperiod=0
&cpuquota=0&cpusetcpus=&cpusetmems=&cpushares=0&dockerfile=Dockerfile&labels=%7B%7D&memory=0&memswap=0
&networkmode=default&rm=1&shmsize=0&t=prdcccapp01.autocapitalcanada.local%3A5000%2Fdocusign%3Alatest&ulimits=null: 
dial unix /var/run/docker.sock: connect: permission denied
 FAILED

=> check users in group & add 
$ grep 'docker' /etc/group
$sudo usermod -a -G docker spark

```
* Get root access in Linux
```shell
$sudo ls /proc/
$sudo nsenter-t 3543

```


# Micro services
* 
```
2017-05-25 17:40:48.931 ERROR 6 --- [  XNIO-2 task-7] io.undertow.request                      : UT005023: Exception handling request to /api/v1/docusign/fin
 
org.springframework.web.util.NestedServletException: Handler dispatch failed; nested exception is java.lang.AbstractMethodError: 

Caused by: java.lang.AbstractMethodError: javax.ws.rs.core.Response$ResponseBuilder.allow(Ljava/util/Set;)Ljavax/ws/rs/core/Response$ResponseBuilder;

// most likely it must be either (1) not properly configured in registry ..or (2)OAuth .. issue..

```
### Front End

```
GET http://prdcibcapp01.autocapitalcanada.local:10000/users/api/account?cacheBuster=1495982868126 401 (Unauthorized)
angular.js:12011 

=> app.user.constants.js : Hard coded
.constant('HOMEP', 'http://prdcibcapp01.autocapitalcanada.local:10000/')

```
=> 

### Do your best ..123
