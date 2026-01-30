package com.work.test;

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int original = num;
        int sum = 0;

        int digits = String.valueOf(num).length();

        while (num != 0) {
            int rem = num % 10;
            sum += (int) Math.pow(rem, digits);
            num /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
