package br.com.agmg.soapexample.exception;

public class InvalidBookReference extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorDetails;
	
	public InvalidBookReference(String reason, String errorDetails) {
		super(reason);
		this.errorDetails = errorDetails;
	}
	
	public String getFaultInfo() {
		return errorDetails;
	}

}
