package com.work.Abstraction;

public interface ComplexCase {

    //java 8 onwards
    static void call(){ // static fn are allowed in interface which have a body
        System.out.println("Complex Csse ");
    }

    default void ring(){
        System.out.println("Ringing ...");
    }
}
