package com.newbankaccount;
import java.util.List;
import java.util.LinkedList;


public class BankAccountApp {


        public static void main(String[] args) {
            List<Account> account = new LinkedList<Account>();

            String file = "C:\\Users\\sshar\\OneDrive\\Desktop\\Java Practice\\NewBankAccounts.csv";
            List<String[]> newAccountHolders = utilities.CSV.read(file);
            for (String[] newAccount : newAccountHolders) {
                String name = (newAccount[0]);
                String ssn = (newAccount[1]);
                String accountType = (newAccount[2]);
                double initialDeposit = Double.parseDouble((newAccount[3]));
                System.out.println("Name : " + name + " ssn : " + ssn + " Account Type : " +
                        accountType + " Initial Deposit : " + initialDeposit);

                if (accountType.equals("Savings")) {
                    account.add(new Savings(name,ssn,initialDeposit));
                } else if (accountType.equals("Checking")) {
                    account.add(new Savings(name,ssn, initialDeposit));
                } else
                    System.out.println("COULDN'T READ THE INPUT");
            }
            for(Account acc: account){
                System.out.println("\n----------------");
                acc.showInfo();
            }
        }
}


