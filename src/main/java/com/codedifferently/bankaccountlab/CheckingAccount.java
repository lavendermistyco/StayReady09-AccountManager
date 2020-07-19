package com.codedifferently.bankaccountlab;

public class CheckingAccount extends BankAccount{
  
    public CheckingAccount(){
        super();

        this.setFees(20.0); //default fees
    }

    public CheckingAccount(Integer accountNum,String name, Integer pin, Double fees){
        super(accountNum, name, pin);
        this.setFees(fees);
    }
    @Override
    public void deposit(Double d){
        this.setBalance(this.getBalance() + d);
    }
    @Override
    public void withdrawal(Double d) {
        this.setBalance(this.getBalance() - d);
    }

  
  
}