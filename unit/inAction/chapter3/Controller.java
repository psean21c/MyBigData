package com.acc.controller;

public interface Controller {

	Response processRequest(Request request);
	void addHandler(Request request, RequestHandler requestHandler);
}
