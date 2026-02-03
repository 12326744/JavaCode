package com.work.Abstraction;

import java.util.logging.Logger;

public interface BankInterface {
    //whatever you declare as variables they are public static final by default
    Logger logger = Logger.getLogger(BankAccount.class.getName());


    //only abstract functions are allowed
    abstract void deposit(long... amounts);
    abstract void withdraw(long amount);



}
