
### Need to create table schema for testing

```
Table schema:
id	bigint
choice	varchar
question_id	bigint
```

### You will be having the problem below when running the command
```
$gradlew bootRun
```
1) 
Description:
Field choiceService in com.ccc.web.rest.ChoiceResource required a bean of type 'com.ccc.service.ChoiceService' that could not be found.

Action:
Consider defining a bean of type 'com.ccc.service.ChoiceService' in your configuration.

>Solution> put the annotation @Service
```java
@Service
public class ChoiceServiceImpl implements ChoiceService {

}
```
2) 
Description:
Field choiceMapper in com.ccc.service.impl.ChoiceServiceImpl required a bean of type 'com.ccc.service.mapper.ChoiceMapper' that could not be found.

Action:
Consider defining a bean of type 'com.ccc.service.mapper.ChoiceMapper' in your configuration.

>Solution> put the annotation @Component

```java
@Component
public class ChoiceMapperImpl implements ChoiceMapper {

}
```


