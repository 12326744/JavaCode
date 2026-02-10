package com.work.collections.queue;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class NthLargestElement {
    public static void main(String[] args) {
        List<Integer> nums = List.of(45, 463, 5, 6, 8, 8, 22, 33, 55, 88, 999, 666, 55, 58, 5, 55, 2, 3, 5, 2);
        int n=4;

        HashSet<Integer> set=new HashSet<>(nums);
        if(set.size()<n){
            System.out.println("Invalid input");
            return;
        }else {
            PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
            pq.addAll(set);

            for (int i=1;i<=n-1;i++){
                pq.poll();
            }
            System.out.println(pq.peek());
        }
    }
}
