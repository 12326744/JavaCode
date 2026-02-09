package com.work.test2;

abstract class Payment {
    abstract void pay(int amount);
}

class CreditCardPayment extends Payment {
    @Override
    void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
class UPIPayment extends Payment {
    @Override
    void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
public class Main {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        payment1.pay(2500);
        Payment payment2 = new UPIPayment();
        payment2.pay(1000);
    }
}
