package com.work.test;

import java.util.Scanner;
public class LeapYearFromDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] parts = date.split("-");

        int year = Integer.parseInt(parts[2]);
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
