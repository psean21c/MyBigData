###

Library to be included ..
```gradle
#build.gradle

    compile 'com.rabbitmq:amqp-client:4.0.2'
    compile 'org.slf4j:slf4j-api:1.7.21'
    compile 'org.slf4j:slf4j-simple:1.7.22'
```

```cmd
javac -cp amqp-client-4.0.2.jar Send.java Recv.java

java -cp .:amqp-client-4.0.2.jar:slf4j-api-1.7.21.jar:slf4j-simple-1.7.22.jar Recv

java -cp .:amqp-client-4.0.2.jar:slf4j-api-1.7.21.jar:slf4j-simple-1.7.22.jar Send

```
