package com.work.Abstraction;

public class BankInterfaceImpl extends OfflineBank implements BankInterface,RBI{
    String name;
    long balance;
    long accountNumber;
    String ifsCode;
    AccountType accountType;


    public BankInterfaceImpl(String name, long balance, long accountNumber, String ifsCode, AccountType accountType) {
        this.name = name;
        this.balance = 1000L;
        this.accountNumber = accountNumber;
        this.ifsCode = ifsCode;
        this.accountType = accountType;
    }

    @Override
    public void deposit(long ... amount){
        for (long amt : amount) {
            if (amt <= 0) {
                logger.warning("Invalid amounts");
            }
            balance += amt;
        }
        logger.info("New balance is "+ balance);
    }

    @Override
    public void withdraw(long amount){
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
    public boolean isLicensed() {
        return false;
    }

}
