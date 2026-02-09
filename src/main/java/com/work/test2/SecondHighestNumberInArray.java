package com.work.test2;

public class SecondHighestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {56, -98, 788, 89, 79, 80};
        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
