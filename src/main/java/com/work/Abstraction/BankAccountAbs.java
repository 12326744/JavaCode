package com.work.Abstraction;

import java.util.logging.Logger;

public abstract class BankAccountAbs {
    String name;
    long balance;
    long accountNumber;
    String ifsCode;
    AccountType accountType;

    Logger logger = Logger.getLogger(BankAccount.class.getName());


    public BankAccountAbs(String name, long balance, long accountNumber, String ifsCode, AccountType accountType) {
        this.name = name;
        this.balance = 1000L;
        this.accountNumber = accountNumber;
        this.ifsCode = ifsCode;
        this.accountType = accountType;
    }

    abstract void deposit(long... amounts);
    abstract void withdraw(long amount);


}
