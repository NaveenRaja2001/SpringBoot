package com.model;

public class InsufficientBalanceException extends Exception {
	String message;
	public InsufficientBalanceException(String string) {
		this.message=string;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
