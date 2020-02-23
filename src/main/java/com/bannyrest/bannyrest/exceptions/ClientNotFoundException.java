package com.bannyrest.bannyrest.exceptions;

public class ClientNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ClientNotFoundException(Integer id) {
		super("Could not find client record " + id);
	}

}
