package com.codedifferently.bankaccountlab;

import org.junit.Test; 
import org.junit.Assert; 

public class BankAccountTest {
  Integer account = 1495;
  String username = "Faith";
  Integer pin = 9877; 
  Double fees = 0.0;
  Double rate = 0.08;

  BankAccount test = new SavingsAccount(account, username, pin, rate);

  @Test 
  public void constructorTest(){
    Integer account = 1455;
    String username = "Faith";
    Integer pin = 9877; 
    Double fees = 5.0;

    BankAccount b = new CheckingAccount(account, username, pin, fees);
    Integer actualAccount = b.getAccountNumber();
    String actualName = b.getName();
    Integer actualPin = b.getPin();
    Double actualFees = b.getFees();

    Assert.assertEquals(account, actualAccount);
    Assert.assertEquals(username, actualName);
    Assert.assertEquals(pin, actualPin);
    Assert.assertEquals(fees, actualFees);
  }

  @Test
  public void getRateTest(){
    Double expected = 0.08; 

    Double actual = test.getRate();

    Assert.assertEquals(expected, actual);

  }

  @Test
  public void setRateTest(){
    Double expected = 20.0; 
    test.setRate(20.0);

    Double actual = test.getRate();

    Assert.assertEquals(expected, actual);

  }

  @Test
  public void getCompanyTest(){
    String expected = "Wilkins El Credit Union"; 

    String actual = test.getCompany();

    Assert.assertEquals(expected, actual);

  }

  @Test
  public void setCompanyTest(){
    String expected = "WECU"; 
    test.setCompany("WECU");

    String actual = test.getCompany();

    Assert.assertEquals(expected, actual);

  }

  @Test
  public void getAccountNumberTest(){
    Integer expected = 1495; 

    Integer actual = test.getAccountNumber();

    Assert.assertEquals(expected, actual);

  }

  @Test
  public void setAccountNumberTest(){
    Integer expected = 2000; 
    test.setAccountNumber(2000);

    Integer actual = test.getAccountNumber();

    Assert.assertEquals(expected, actual);

  }

  @Test
  public void getFeesTest(){
    Double expected = 0.0; 

    Double actual = test.getFees();

    Assert.assertEquals(expected, actual);

  }

  @Test
  public void setFeesTest(){
    Double expected = 0.20; 
    test.setFees(0.20);

    Double actual = test.getFees();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void getNameTest(){
    String expected = "Faith"; 

    String actual = test.getName();

    Assert.assertEquals(expected, actual);

  }

  @Test
  public void setNameTest(){
    String expected = "Faith Wilkins El"; 
    test.setName("Faith Wilkins El");

    String actual = test.getName();

    Assert.assertEquals(expected, actual);

  }

  @Test
  public void getPinTest(){
    Integer expected = 9877; 

    Integer actual = test.getPin();

    Assert.assertEquals(expected, actual);

  }

  @Test
  public void setPinTest(){
    Integer expected = 1234;
    test.setPin(1234); 

    Integer actual = test.getPin();

    Assert.assertEquals(expected, actual);

  }

  @Test 
  public void getBalanceTest(){
    Double expected = 500.0;

    Double actual = test.getBalance(); 

    Assert.assertEquals(expected, actual);
  }

  @Test 
  public void setBalanceTest(){
    Double expected = 5000.0;
    test.setBalance(5000.0);

    Double actual = test.getBalance(); 

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void isLoggedInTest(){
    Boolean expected = false; 

    Boolean actual = test.isLoggedIn();

    Assert.assertEquals(expected, actual);

  }

  @Test
  public void logInTest(){
    Boolean expected = true; 
    test.logIn();

    Boolean actual = test.isLoggedIn();

    Assert.assertEquals(expected, actual);
    
  }

  @Test
  public void logOutTest(){
    Boolean expected = false; 
    test.logOut();

    Boolean actual = test.isLoggedIn();

    Assert.assertEquals(expected, actual);
    
  }


}
