
### Can we mock private fields of a class for JUnit testing?


http://stackoverflow.com/questions/29901351/can-we-mock-private-fields-of-a-class-for-junit-testing


### Mockito

Mockito



What’s a mock?
```
- automatically generated class
- Doesn’t do anything
- Behaviour verification
```


What’s a stub?
```


```



/build.gralde

testCompile ‘org.mockito:


1) Creating a mock - annotation
```

@Mock
private WebService mockWebService;

@Rule
public MockitoRule rule = MockitoJUnit.rule();
```


2) Verifying interactions
```

@Test
Public void verifyInterationTimes() throws Exception{
	User user = new User(mockWebService, USER_ID,PASSWORD);
	user.logout();

	verify(mockWebService, times(1) ).logout();
				atLeast(1)
				atLeastOnce()
				atMost(1)
				only()
				never()
}
```

- Being overly restrictive makes tests brittle!!

Parameters
	verify(mockWebService, login(anyInt() ).logout();


