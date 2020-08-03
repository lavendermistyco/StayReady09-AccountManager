package com.codedifferently.bankaccountlab;

import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainApplication {

  static List<BankAccount> bankStorage = new ArrayList<BankAccount>();
  static Scanner input = new Scanner(System.in);
  static BankAccount acc;
  private static final Logger log = Logger.getGlobal();

  public static void main(String[] args) {

    System.out.println("Hey welcome to ");

  }

  /* Helper Methods */

  public static void chooseAccountToCreate() throws InputMismatchException {

  }

  public static void createAccount() {
    chooseAccountToCreate();
    bankStorage.add(acc);
    setPin(); 

  }
  public static boolean isCountFour(int x){
    int count = 0; 
    while(x != 0){
      x /= 10;
      count++; 
    }
    if(count == 4){
      return true;
    } else {
      return false;
    }
  }

  private static void setPin(){
    try {
      
      System.out.println("Enter a 4 digit pin:"); 
      int pin = input.nextInt();
      while(!isCountFour(pin)){
        setPin();
      }
      acc.setPin(pin);
      
    } catch (InputMismatchException e){
      log.info("Please input a number!");
    }

  }


//menu once you have logged in 
  public static void startup() throws InputMismatchException , NullPointerException{ //enter choices
    switch(input.nextInt()){
      case 1:
      System.out.println("E"); 


    }

  }

  public static void login(){

  }





} 
