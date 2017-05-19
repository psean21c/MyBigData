### Steps

```xml
Assignment for Spring Boot
1) Set annotation for Scheduler:  to be up and run every 5 second => print
2) Autowired / Inject to create Inovatec
3) To print value in the yaml file after reading it (Using @Value annotation)
 i.e.	@Value("${app.documan.rabbitmq.queues.documan}")

```

### File Structure
```java
{project}
 |- build.gradle
 |-src/maim/java/com/ccc
         |- Application.java
         |- Inovatec.java
 |-src/maim/java/com/ccc/rabbitmq
         |- DocumanConsumer.java
 |-src/maim/resources
         |- application-dev.yml
         |- application.yml
```

### Expected result

```txt
write:consumer
app01 was created in the construct
called:consumer: hello.world.queue
2017-05-18 15:49:43.928  INFO 50015 --- [           main] com.ccc.Application: Started Application in 11.209 seconds (JVM running for 11.524)
called:consumer: hello.world.queue
called:consumer: hello.world.queue
 ..
 
```

### Prototypes

```java
// Application.java
// ?? (1) Main annotation for SpringBoot
// ?? (2) Additional annotation to enable Scheduler
public class Application {

    // ??
    DocumanConsumer documanConsumer;
    
    // ??
    Inovatec buildApplication() {
    	documanConsumer.methodWrite();
        return new Inovatec("app01");
    }
     
    public static void main(String[] args) throws InterruptedException {
    	SpringApplication.run(Application.class, args);
    }

}
```


```java
// Inovatec.java
public class Inovatec {

	String application;

	public Inovatec() {}

	public Inovatec(String application) {
		System.out.println(application + " was created in the construct");
		this.application = application;
	}
	
}
```


```java
// DocumanConsumer.java
// ??
public class DocumanConsumer {

	final String consumer = "consumer";
	
	@Value("${app.documan.rabbitmq.queues.documan}")
	private String docuName;
	
	// ??
	public void methodCall(){
		System.out.println("called:" + consumer + ": " + docuName);
	}
	
	public void methodWrite(){
		System.out.println("write:" + consumer);
	}
}

```

```gradle
// build.gradle
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:1.5.2.RELEASE")
    }
}

apply plugin: 'java'
apply plugin: 'application'
apply plugin: 'eclipse'

jar {
    baseName = 'gs-messaging-rabbitmq'
    version =  '0.1.0'
}

repositories {
    mavenCentral()
}

sourceCompatibility = 1.8
targetCompatibility = 1.8

dependencies {
    compile 'org.springframework.boot:spring-boot:1.5.2.RELEASE'
    compile 'org.springframework.boot:spring-boot-autoconfigure:1.5.2.RELEASE'
    compile 'org.springframework.boot:spring-boot-starter-logging:1.5.2.RELEASE'
    compile 'org.springframework.boot:spring-boot-starter:1.5.2.RELEASE'
    compile 'org.springframework.boot:spring-boot-starter-test:1.5.2.RELEASE'
    compile 'org.springframework.amqp:spring-rabbit:1.7.0.RELEASE'
    compile 'org.springframework.amqp:spring-amqp:1.7.0.RELEASE'
    
	compile 'javax.inject:javax.inject:1'
    compile 'com.rabbitmq:amqp-client:4.0.2'
}

```

```yml
#application.yml
app:
  documan:  
    rabbitmq:
      connection:
        username: user
        password: user
        hostname: localhost
      queues:
        documan: hello.world.queue
      exchanges: 
        intercom: intercom
      routingKeys:
        documanRequiredFiles: documan.required.files
```

### Reference

24. Externalized Configuration

[Spring Boot official](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html)

Spring Boot - How auto configuration works?

[Logic Big Java Spring](http://www.logicbig.com/tutorials/spring-framework/spring-boot/auto-config-mechanism/)

 
