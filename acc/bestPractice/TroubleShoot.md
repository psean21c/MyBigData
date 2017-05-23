
###


### RabbitMQ
```txt
#./gradlew bootRun
org.springframework.context.ApplicationContextException: 
Failed to start bean ‘org.springframework.amqp.rabbit.config.internalRabbitListenerEndpointRegistry’; 
nested exception is org.springframework.amqp.AmqpIllegalStateException: Fatal exception on listener startup

Caused by: com.rabbitmq.client.ShutdownSignalException: channel error; protocol method: #method<channel.close>
(reply-code=404, reply-text=NOT_FOUND - no queue ‘Inovatec’ in vhost ‘/’, class-id=50, method-id=10)

```
* You have to add this specific queue in application-prod.yml
