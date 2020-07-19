package com.codedifferently.bankaccountlab;

public class SavingsAccount extends BankAccount {

  public SavingsAccount(){
    super(); 
    this.setRate(2.0);
  }

  public SavingsAccount(Integer account, String username, Integer pin, Double rate){
    super(account, username, pin); 
    this.rate = rate; 
  }

  @Override
  public void deposit(Double d) {
    this.setBalance(this.getBalance() + d);
  }

  @Override
  public void withdrawal(Double d) {
    if(this.getBalance() - d >= 0){
      this.setBalance(this.getBalance() - d);
    } else {
      System.out.println("You too poor!");
    }
  }
  
}