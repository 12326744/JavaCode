package com.work.collections.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String... args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder()); //maxHeap
        pq.add(4);
        pq.add(42);
        pq.add(41);
        pq.add(-4);
        pq.add(56);
        pq.add(56);
        pq.add(14);
        System.out.println(pq);  //unordered

        Integer poll = pq.poll();
        System.out.println(poll);

        System.out.println(pq);
        Integer poll2=pq.poll();
        System.out.println(poll2);

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);

        for (Integer num:pq){
            System.out.print(num+" ");
        }
    }
}
