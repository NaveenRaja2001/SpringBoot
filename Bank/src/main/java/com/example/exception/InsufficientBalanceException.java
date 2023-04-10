/**
 * 
 */
package com.example.exception;

/**
 * @author naveenraja
 *
 */
public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}

}
