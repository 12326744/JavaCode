package com.work.test2;

import java.util.Scanner;

public class StringManipulation {
    public static void manipulateString(int n, String str) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        result = result.toUpperCase();
        System.out.println(result);
        System.out.println("Length: " + result.length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        manipulateString(n, str);
    }
}

