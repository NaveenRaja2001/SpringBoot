/**
 * 
 */
package com.example.exception;

/**
 * @author naveenraja
 *
 */
public class InsufficientBalanceException extends Exception{
String message;

public InsufficientBalanceException(String message) {
	this.message = message;
}

}