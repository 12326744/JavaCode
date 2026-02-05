package com.work.Abstraction;

public interface LokSabha {
    void elect(int candidate);
    static void members(){
        System.out.println("There are "+ 543 + " members in Loksabha");
    }

    default void locationOfLokSabha(){
        System.out.println("Location is Delhi");
    }
}
