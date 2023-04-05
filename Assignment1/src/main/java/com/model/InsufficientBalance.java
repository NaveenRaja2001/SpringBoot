package com.model;

public class InsufficientBalance extends Exception {
	String msg;
	public InsufficientBalance(String str) {
		this.msg=str;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
