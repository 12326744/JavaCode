package com.work.exceptions;

import java.util.Scanner;

public class TryCatchCombo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

            try {
                for(int i=0;i<num;i++) {
                    Thread.sleep(500);
                    System.out.println(i);
                }
//                return;
                System.exit(5); // forcefully finally will run
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                System.out.println("Finally block created");
                sc.close();
            }
        //        sc.close();  //after closing we cannot take the input anymore with the same sc objects

    }
}
