package com.ecom.responswrapper;

public class ProductRR {
	
	private String message;
	private Object data;
	
	public ProductRR(String message, Object data) {
		super();
		this.message = message;
		this.data = data;
	}
	public ProductRR() {
		super();
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	

}
