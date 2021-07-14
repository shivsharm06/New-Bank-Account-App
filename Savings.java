package com.newbankaccount;

public class Savings extends Account{ //Properties
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;


    public Savings(String name, String ssn, double initialDeposit) {
        super(name, ssn, initialDeposit);
        account_number = "1" + account_number;
        setSafetyDepositBox();
    }

    public void setRate(){
        rate=getBaseRate( )- .25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID= (int)(Math.random()*Math.pow(10,3));
        safetyDepositBoxKey= (int)(Math.random()*Math.pow(10,4));
    }



    public void showInfo(){
        super.showInfo();
        System.out.println("Your savings account details: " +
                " \nSafety Deposit Box ID : " +safetyDepositBoxID+
                "\nSafety Deposit Box Key : "+ safetyDepositBoxKey);
    }
}
