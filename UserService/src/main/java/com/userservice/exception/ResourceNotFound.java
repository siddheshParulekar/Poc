package com.userservice.exception;

public class ResourceNotFound extends RuntimeException {
	
	public ResourceNotFound() {
		super("Resource not found");
	}
	
	public ResourceNotFound(String msg) {
		super(msg);
	}

}
