package com.newbankaccount;

public abstract class Account implements IBaseRate {
    private String name;
    private String ssn;
    private double balance;
    private static int index=10000;
    protected String account_number;
    protected double rate;


    public Account(String name, String ssn, double initialDeposit){
        this.name=name;
        this.ssn=ssn;
        balance=initialDeposit;

        this.account_number=setAccountNumber();

        index++;

        setRate();
    }

    public abstract void setRate();

    private  String setAccountNumber() {
        String lastTwoOfSsn= ssn.substring(ssn.length()-2,ssn.length());
        int uniqueID=index;
        int randomNumber= (int)(Math.random()*Math.pow(10,3));
        return  lastTwoOfSsn+index+randomNumber;
    }
    public void compound(){
        double accruedInterest= balance*(rate/100);
        balance=balance+accruedInterest;
        System.out.println("Accrued Interest : " + accruedInterest);
        printBalance();
    }

    public void deposit(int amount){
        balance=balance+amount;
        System.out.println("Depositing :" + amount);
        printBalance();
    }
    public void withdraw(int amount){
        balance=balance-amount;
        System.out.println("Withdrawing :" +amount );
        printBalance();
    }
    public void transfer(int amount, String toWhom){
        balance=balance-amount;
        System.out.println("Sending amount "+amount+ " to " + toWhom);
        printBalance();
    }
    public void printBalance(){
        System.out.println("Your balance is " + balance);
    }
    public void showInfo(){
        System.out.println(
                "Name : " + name +
                        "\nAccountNumber : " + account_number +
                        "\nBalance : " + balance +
                        "\nRate : " + rate + "%"
        );
    }

}
