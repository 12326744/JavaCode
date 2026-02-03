package com.work.Abstraction;

import java.util.Arrays;

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
        //Interfaces
        BankInterface bankInterface = new BankInterfaceImpl("Krishna", 500000, 124578545,
                "HDFC12", AccountType.SAVING);

        BankInterface ac4=new BankInterface() {
            @Override
            public void deposit(long... amounts) {
                System.out.println("depositing: "+ Arrays.toString(amounts));
            }

            @Override
            public void withdraw(long amount) {
                System.out.println("withdrawing: "+ amount);
            }
        };
        ac4.withdraw(1000);
        ac4.deposit(1000,2000);

        ComplexCaseImpl c1=new ComplexCaseImpl();
        c1.ring();
        c1.ring1();
    }
}
