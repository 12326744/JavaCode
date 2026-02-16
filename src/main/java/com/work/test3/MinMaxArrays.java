package com.work.test3;

public class MinMaxArrays {
    public static void findMinMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Error: Invalid Array");
            return;
        }
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Min-value : " + min + ", Max-value: " + max);
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 1, 5};
        findMinMax(arr);
    }
}
