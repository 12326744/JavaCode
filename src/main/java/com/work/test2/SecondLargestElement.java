package com.work.test2;

import java.util.Scanner;

public class SecondLargestElement {
    public static int findSecondLargest(int[] arr) {
        int largest =arr[0];
        int secondLargest =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result= findSecondLargest(arr);
        System.out.println("Second Largest: " + result);
    }
}
