package com.newbankaccount;

public class Checking  extends  Account{
        //Properties
        long  debitCardNumber;
        int debitCardPin;

        //Constructor

        public Checking(String name, String ssn, double initialDeposit){
            super(name, ssn, initialDeposit);
            account_number="2"+ account_number;
            setDebitCard();
            setRate();
        }
        public void setRate(){
            rate=getBaseRate( ) * .15;
        }
        // Methods
        private void setDebitCard(){
            debitCardNumber=(long)(Math.random()*Math.pow(10,12));
            debitCardPin= (int)(Math.random()*Math.pow(10,4));
        }


        public void showInfo(){
            super.showInfo();
            System.out.println("Your checking account features following : " +
                    "\n Your Debit Card Number: " +debitCardNumber+
                    "\n Your Debit Card Pin :" + debitCardPin);

        }
}
