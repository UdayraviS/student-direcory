package com.cruds.demo;

public class InputMismatchException extends RuntimeException{
	private int info;
	private String info1;
	public int getInfo() {
		return info;
	}
	public String getInfo1() {
		return info1;
	}
	public InputMismatchException(int info, String info1) {
		super();
		this.info = info;
		this.info1 = info1;
	}
	

}
