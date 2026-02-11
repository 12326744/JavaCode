package com.work.questionpractice;

import java.util.HashMap;

public class TwoSumHashMap {
    public static void main(String[] args) {

        int[] arr = {2, 5, 7, 8, 11, 2};
        int tar = 10;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int need = tar - arr[i];

            if (map.containsKey(need)) {
                System.out.println(map.get(need) + " " + i);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("0");
    }
}
// TODO Tomorrow learn mergesort , Stack

//Basics
//Bitwise
//Arrays
//String
//Stack
//Queue
//LinkedList -- single LinkedList, Double LinkedList
//2 pointer
//Sliding window
//Recursion -- Tree,Dp,Graph
//trie
//bubble sort, merger sort,selection sort
//binary search

