package com.acc.controller;

import java.util.HashMap;
import java.util.Map;

public class DefaultController implements Controller {

	private Map<String, RequestHandler> requestHandlers = new HashMap<String, RequestHandler>();
	
	protected RequestHandler getHandler(Request request){
		if(!this.requestHandlers.containsKey(request.getName())) {
			String message = "Not find handler [" + request.getName() + "]";
			throw new RuntimeException(message);
		}
		return this.requestHandlers.get(request.getName());
	}
	
	@Override
	public Response processRequest(Request request) {
		Response response;
		try {
			response = getHandler(request).process(request);
		} catch(Exception e) {
			response = new ErrorResponse(request, e);
		}
		return response;
	}

	@Override
	public void addHandler(Request request, RequestHandler requestHandler) {

		if(this.requestHandlers.containsKey(request.getName())){
			throw new RuntimeException("A request handler has already been registered for [" + request.getName() + "]");
		} else {
			this.requestHandlers.put(request.getName(), requestHandler);
		}

	}

}
