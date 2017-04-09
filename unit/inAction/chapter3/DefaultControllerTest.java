package com.junit.chapter3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.model.TestTimedOutException;

import com.junit.chapter3.DefaultController;
import com.junit.chapter3.Request;
import com.junit.chapter3.RequestHandler;
import com.junit.chapter3.Response;

public class DefaultControllerTest {

	private DefaultController controller;
	private Request request;
	private RequestHandler handler;
	
	private class SampleRequest implements Request{
		private static final String DEFAULT_NAME = "Test";
		private String name;
		public SampleRequest(String name){
			this.name = name;
		}
		
		public SampleRequest(){
			this(DEFAULT_NAME);
		}
		public String getName(){
			return this.name;
		}
	}
	
	private class SampleHandler implements RequestHandler{

		@Override
		public Response process(Request request) throws Exception {
			return new SampleResponse();
		}
	}
	
	
	private class SampleExceptionHandler implements RequestHandler{

		@Override
		public Response process(Request request) throws Exception {
			return (Response) new Exception("error processing request");
		}
	}
	
	
	private class SampleResponse implements Response{

		private static final String NAME = "Test";
		
		@Override
		public String getName(){
			return NAME;
		}
		
		public boolean equals(Object object){
			boolean result = false;
			if(object instanceof SampleResponse){
				result = ((SampleResponse) object).getName().equals(getName());
			}
			return result;
		}
		
		public int hashCode(){
			return NAME.hashCode();
		}

	}

	@Before
	public void instantiate() throws Exception {
		controller = new DefaultController();
		request = new SampleRequest();
		handler = new SampleHandler();
		controller.addHandler(request, handler);
	}



	@Test
	public void testAddHandler() {
		RequestHandler handler2 = controller.getHandler(request);
		assertSame("Handler ", handler2, handler);
	}
	
	@Test
	public void testProcessRequest(){
		Response response = controller.processRequest(request);
		assertNotNull("Must not return a null response", response);
		assertEquals("Be of type SampeReponse", SampleResponse.class, response.getClass());
	}
	
	@Test
	public void testProcessRequestAnswersErrorResponse(){
		SampleRequest request = new SampleRequest("testError");
		SampleExceptionHandler handler = new SampleExceptionHandler();
		controller.addHandler(request, handler);
		Response response = controller.processRequest(request);
		
		assertNotNull("Must not return a null response", response);
		assertEquals(ErrorResponse.class,response.getClass());
		
	}
	
	@Test(expected=RuntimeException.class)
	public void testGetHandlerNotDefined(){
		SampleRequest request = new SampleRequest("testNotDefined");
		controller.getHandler(request);
	}
	
	@Test(expected=RuntimeException.class)
	public void testAddRequestDuplcateName(){
		SampleRequest request = new SampleRequest();
		SampleHandler handler = new SampleHandler();
		controller.addHandler(request, handler);
	}
	
	@Test(timeout=130)
	@Ignore(value="Ignore for now until we decide a decent time")
	public void testProcessMultipleRequestsTimeout(){
		Request request;
		Response response = new SampleResponse();
		RequestHandler handler = new SampleHandler();
//		long startTime = System.currentTimeMillis();
		
		for(int i=0;i <99999999;i++){
			request = new SampleRequest(String.valueOf(i));
			controller.addHandler(request, handler);
			response = controller.processRequest(request);
			assertNotNull(response);
			assertNotSame(ErrorResponse.class, response.getClass());
		}
		
//		long endTime = System.currentTimeMillis();
//		double estimatedTime = ((endTime - startTime) / 1000); // milliseconds
//		System.out.println("Elapsed Time:" + estimatedTime + " seconds");
	}

}
