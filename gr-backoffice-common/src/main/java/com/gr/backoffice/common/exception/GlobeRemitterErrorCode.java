package com.gr.backoffice.common.exception;

public enum GlobeRemitterErrorCode {
	
	NO_DATA_FOUND(404, "NO DATA FOUND");
	
	private int errorCode;
	private String errorMessage;
	
	private GlobeRemitterErrorCode(int errorCode, String errorMessage)
	{
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
