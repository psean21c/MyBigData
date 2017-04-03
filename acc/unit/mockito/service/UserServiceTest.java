package com.acc.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.doThrow;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class UserServiceTest {

	// Stubbing Basic
	@Test
	public void testThenReturn() throws Exception{
		
		UserManager manager = Mockito.mock(UserManager.class);
		Mockito.when(manager.getUserCount()).thenReturn(50);
		
		UserService userService = new UserService(manager);
		assertEquals(50, userService.getUserCount());
	}
	
	@Test
	public void testThenThrow() throws Exception{
		UserManager manager = Mockito.mock(UserManager.class);
		Mockito.when(manager.getUserCount()).thenThrow(new RuntimeException());
		
		UserService userService = new UserService(manager);
		assertEquals(-1, userService.getUserCount());
		
	}

	@Test(expected = RuntimeException.class)
	public void testDoThrow() throws Exception {
		UserManager manager = Mockito.mock(UserManager.class);
		doThrow(new RuntimeException("Not implemented")).when(manager.getUserCount());

		UserService userService = new UserService(manager);
		assertEquals(-1, userService.getUserCount());

	}	      
	      
	
	@Test
	public void testThenAnswer() throws Exception{
		UserManager manager = Mockito.mock(UserManager.class);
		
		Mockito.when(manager.getUserCount()).thenAnswer(new Answer(){
			public int count=0;
			@Override
			public Object answer(InvocationOnMock invocation) throws Throwable {
				return ++count;
			}
			
		});

		
		UserService userService = new UserService(manager);
		assertEquals(1, userService.getUserCount());		
		assertEquals(2, userService.getUserCount());		
		assertEquals(3, userService.getUserCount());		
		
	}
	
	// Verifying Mock
	@Test
	public void testSave() throws Exception{
		UserManager manager = Mockito.mock(UserManager.class);
		UserService userService = new UserService(manager);
		userService.save("Simon");
		
		Mockito.verify(manager).save("Simon");
		
		verify(manager, Mockito.times(1)).save("Simon");
		verify(manager, Mockito.times(0)).getUserCount();
		
	}

/***
 * 
ArgumentCaptor<Person> argument = ArgumentCaptor.forClass(Person.class);
verify(mock).doSomething(argument.capture());
assertEquals("John", argument.getValue().getName());
 */

	@Test
	public void testSave2() throws Exception{
		UserManager manager = Mockito.mock(UserManager.class);
		ArgumentCaptor<String> arg = ArgumentCaptor.forClass(String.class);
		
		UserService userService = new UserService(manager);
		userService.save("Simon");
		
		verify(manager).save(arg.capture());
		assertEquals("Simon", arg.getValue());
		
	}

	
	//Argument Matching
	@Test
	public void testSave3() throws Exception{
		UserManager manager = Mockito.mock(UserManager.class);
		UserService userService = new UserService(manager);
		
		userService.save("Simon");
		verify(manager).save("Simon");
		verify(manager).save(Mockito.anyString());
		verify(manager).save(Mockito.<String>any());
		
	}
	


}
