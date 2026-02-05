package com.work.exceptions;

public class MainError {
    static int counter=0;

    public static void main(String[] args){
        call();
    }

    static void call(){
        System.out.println("Calling "+ ++counter);
        call();
    }
}
//hw
// private constructor why?
//equal hashcode contract