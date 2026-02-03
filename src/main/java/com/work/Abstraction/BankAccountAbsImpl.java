package com.work.Abstraction;

public class BankAccountAbsImpl extends BankAccountAbs{
    public BankAccountAbsImpl(String name, long balance, long accountNumber, String ifsCode, AccountType accountType) {
        super(name, balance, accountNumber, ifsCode, accountType);
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
}
