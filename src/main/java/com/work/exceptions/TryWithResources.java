package com.work.exceptions;

import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
        // since Scanner is an indirect child of AutoCloseable so we can put in try with resources
        try (Scanner sc=new Scanner(System.in);){
            int num=sc.nextInt();
            for(int i=0;i<num;i++) {
                Thread.sleep(500);
                System.out.println(i);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Finally block created");
//            sc.close();
        }
    }
}
