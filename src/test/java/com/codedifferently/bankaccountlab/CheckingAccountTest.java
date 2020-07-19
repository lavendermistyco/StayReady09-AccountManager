package com.codedifferently.bankaccountlab;

import org.junit.Test; 
import org.junit.Assert; 

public class CheckingAccountTest {
  CheckingAccount check = new CheckingAccount(99, "Bob", 9864, 23.0);

  @Test 
  public void depositTest(){

    Double expected = 750.00;
    check.deposit(250.0);

    Double actual = check.getBalance(); 

    Assert.assertEquals(expected, actual);
  }

  @Test 
  public void withdrawalTest(){

    Double expected = 250.00;
    check.withdrawal(250.0);

    Double actual = check.getBalance(); 

    Assert.assertEquals(expected, actual);
  }


  
}