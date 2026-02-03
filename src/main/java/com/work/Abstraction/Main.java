package com.work.Abstraction;

public class Main {
    public static void main(String[] args) {
        BankAccount ac1 = new BankAccount("Krishna", 500000, 124578545,
                "HDFC12", AccountType.SAVING);
        System.out.println(ac1);
        ac1.deposit(32, 3, 3332, 2, -9);
        System.out.println(ac1);

        ac1.withdraw(400);
        System.out.println(ac1);

//        BankAccount ac2=new BankAccountAbs("Krishna",500000,124578545,
//                "HDFC12",AccountType.SAVING);   // we cannot create object of abstract class

        BankAccountAbs ac2 = new BankAccountAbsImpl("Krishna", 500000, 124578545,
                "HDFC12", AccountType.SAVING);

        BankAccountAbs ac3 = new BankAccountAbs("Krishna", 500000, 124578545,
                "HDFC12", AccountType.SAVING) {
            @Override
            void deposit(long... amounts) {  //TODO

            }

            @Override
            void withdraw(long amount) { //TODO

            }
        };



    }
}
