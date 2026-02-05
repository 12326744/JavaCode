package com.work.Abstraction;

public class Main2 {
    public static void main(String[] args) {
        LokSabhaImpl l1=new LokSabhaImpl();
        l1.elect(8);
        l1.locationOfLokSabha();

        LokSabha l2 =new LokSabha() {
            @Override
            public void elect(int candidate) {
                System.out.println("Election is near");
            }
        };
        l2.elect(8);
        l2.locationOfLokSabha();

        LokSabha l3 =(candidate) ->{
            System.out.println("Election is live");
        };
        l3.locationOfLokSabha();
        l3.elect(8);
    }
}
