package com.work.Abstraction;

import java.util.logging.Logger;

public class BankAccount {
        String name;
        long balance;
        long accountNumber;
        String ifsCode;
        AccountType accountType;

        Logger logger = Logger.getLogger(BankAccount.class.getName());


    public BankAccount(String name, long balance, long accountNumber, String ifsCode, AccountType accountType) {
        this.name = name;
        this.balance = 1000L;
        this.accountNumber = accountNumber;
        this.ifsCode = ifsCode;
        this.accountType = accountType;
    }


   void deposit(long ... amount){
        for (long amt : amount) {
            if (amt <= 0) {
                logger.warning("Invalid amounts");
            }
            balance += amt;
        }
        logger.info("New balance is "+ balance);
    }

    void withdraw(long amount){
        if(amount>0){
            if(balance>=amount){
                balance-=amount;
            }
        }else{
            logger.warning("Invalid amount");
        }
        logger.info("New balance is "+ balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", ifsCode='" + ifsCode + '\'' +
                ", accountType=" + accountType +
                '}';
    }
}
