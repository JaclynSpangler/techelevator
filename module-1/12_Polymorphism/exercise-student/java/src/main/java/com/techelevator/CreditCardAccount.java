package com.techelevator;

public class CreditCardAccount implements Accountable {

    private String accountHolder;
    private String accountNumber;
    private int debt;

    public String getAccountHolder(){
        return accountHolder;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public int getDebt(){
        return debt;
    }
    @Override
    public int getBalance() {
        return -debt;
    }


    //constructor
    public CreditCardAccount(String accountHolder, String accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        debt = 0;
    }

    public int pay(int amountToPay){
        debt -= amountToPay;
        return debt;
    }
    public int charge(int amountToCharge){
        debt += amountToCharge;
        return debt;
    }
}
