package com.codedifferently.bankaccountlab;

import org.junit.*;

public class BusinessAccountTest {

  BusinessAccount b = new BusinessAccount(34235, "Charlie", 8773, 4.0);

  @Test
  public void getTaxIdTest(){
    Double expected = 4.0; 

    Double actual = b.getTaxId();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void setTaxIdTest(){
    Double expected = 8.0; 
    b.setTaxId(8.0);


    Double actual = b.getTaxId();

    Assert.assertEquals(expected, actual);
  }
  
  @Test
  public void depositTest(){
    b.setBalance(787859.94);
    Double expected = 787860.94;

    b.deposit(1.0);
    Double actual = b.getBalance();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void withdrawalTest(){
    b.setBalance(2.0);
    Double expected = 1.0;

    b.withdrawal(1.0);
    Double actual = b.getBalance();

    Assert.assertEquals(expected, actual);
  }

  
}