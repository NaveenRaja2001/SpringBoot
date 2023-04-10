package com.example.demo;

import com.example.exception.IdAlreadyExistException;
import com.example.exception.InsufficientBalanceException;

public interface BankServiceInterface {
      public void createUser(BankDTO bank) throws IdAlreadyExistException;
      public BankDTO checkBalance(int id);
     public void transfer(Transaction trans) throws InsufficientBalanceException;
}
