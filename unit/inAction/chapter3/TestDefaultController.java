package com.acc.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

public class TestDefaultController {

	private DefaultController controller;
	private Request request;
	private RequestHandler handler;
	
	private class SampleRequest implements Request{
		public String getName(){
			return "Test";
		}
	}
	
	private class SampleHandler implements RequestHandler{

		@Override
		public Response process(Request request) throws Exception {
			return new SampleResponse();
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
		assertSame("Handler ", handler2,handler);
		
	}
	
	@Test
	public void testProcessRequest(){
		Response response = controller.processRequest(request);
		assertNotNull("Must not return a null response", response);
		assertEquals("Be of type SampeReponse", SampleResponse.class, response.getClass());
		
	}

}
