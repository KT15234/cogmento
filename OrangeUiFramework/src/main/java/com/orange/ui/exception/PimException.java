package com.orange.ui.exception;

public class PimException extends RuntimeException{

	public PimException()
	{
		super();
	}
	
	public PimException(String CustomExceptionMessage)
	{
		super(CustomExceptionMessage);
	}

}

