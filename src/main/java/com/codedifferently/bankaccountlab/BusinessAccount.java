package com.codedifferently.bankaccountlab;

public class BusinessAccount extends BankAccount {
  private Double taxId;

  public BusinessAccount(){
    super(); 
    this.taxId = 0.0;
  }

  public BusinessAccount(Integer account, String username, Integer pin, Double taxId){
    super(account, username, pin);
    this.taxId = taxId;
    this.setRate(2.00);
  }

  public Double getTaxId(){
    return this.taxId;
  }

  public void setTaxId(Double d){
    this.taxId = d; 
  }

  @Override
  public void deposit(Double d) {
    this.setBalance(this.getBalance() + d);
  }

  @Override
  public void withdrawal(Double d){
    if(this.getBalance() - d >= 0){
      this.setBalance(this.getBalance() - d);
    } else {
      System.out.println("Not enough money!");
    }
  }

   
}