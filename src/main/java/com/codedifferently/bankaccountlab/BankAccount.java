package com.codedifferently.bankaccountlab;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class BankAccount {
  static AtomicInteger num = new AtomicInteger();
  private String username; 
  private Integer accountNumber; 
  private Integer pin;
  private Double fees;
  private Double balance; 
  private String company; 
  public Double rate;
  public boolean isLoggedIn; 

  public BankAccount(){
    this.company = "Wilkins El Credit Union";
    this.accountNumber = num.incrementAndGet();
    this.fees = 0.0;
    this.username = ""; 
    this.pin = 0; 
    this.balance = 500.0; 
    this.rate = 0.0; 
    this.isLoggedIn = false;

  }

  public BankAccount(Integer account, String username, Integer pin){
    this();
    this.accountNumber = account; 
    this.username = username; 
    this.pin = pin; 
  }

  public abstract void deposit(Double d);

  public abstract void withdrawal(Double d);

  public Double getRate(){
    return this.rate;
  }
  public void setRate(Double d){
    this.rate = d; 
  }

  public String getCompany(){
    return this.company; 
  }

  public void setCompany(String company){
    this.company = company;
  }

  public Integer getAccountNumber(){
    return this.accountNumber;
  }

  public Double getFees(){
    return this.fees;
  }

  public String getName(){
    return this.username; 
  }

  public Integer getPin(){
    return this.pin;
  }

  public Double getBalance(){
    return this.balance; 
  }

  public void setName(String name){
    this.username = name;
  }

  public void setAccountNumber(Integer num){
    this.accountNumber = num;
  }

  public void setPin(int pin){
    this.pin = pin;
  }

  public void setBalance(Double balance){
    this.balance = balance;
  }

  public void setFees(Double fees){
    this.fees = fees;
  }

  public void logIn(){
    this.isLoggedIn = true;
  }
  
  public boolean isLoggedIn(){
    return this.isLoggedIn;
  }

  public void logOut(){
    this.isLoggedIn = false;
  }


  

}
