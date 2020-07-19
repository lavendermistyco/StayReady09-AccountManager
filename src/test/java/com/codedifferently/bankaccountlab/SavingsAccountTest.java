package com.codedifferently.bankaccountlab;
import org.junit.Test; 
import org.junit.*;


public class SavingsAccountTest {
  @Test 
  public void depositTest(){
    SavingsAccount loosh = new SavingsAccount(54545, "Luc", 2232, 0.80);
    loosh.setBalance(20000.0);
    Double expected = 25600.80;

    loosh.deposit(5600.80); 
    Double actual = loosh.getBalance(); 

    Assert.assertEquals(expected, actual);
  }

  @Test 
  public void withdrawalTest(){
    SavingsAccount loosh = new SavingsAccount(54545, "Luc", 2232, 0.80);
    loosh.setBalance(25600.80);
    Double expected = 20000.00;

    loosh.withdrawal(5600.80); 
    Double actual = loosh.getBalance(); 

    Assert.assertEquals(expected, actual);
  }




  
}