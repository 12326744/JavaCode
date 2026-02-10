package com.work.collections.set;

import java.util.*;
import java.util.stream.Collectors;

public class HashSetExample {
    public static void main(String[] args) {

        List<Integer> nums=List.of(55,42,2,3,24,21,5,2,11,5,2);

        ArrayList<Integer> list = new ArrayList<>();
        for(int num:nums){
            if (!list.contains(num)){
                list.add(num);  // O(n^2) --TC
            }
        }
        System.out.println(list);

//        HashSet<Integer> set = new HashSet<>();
        LinkedHashSet<Integer> set = new LinkedHashSet<>(); //we use LinkedHashSet for sorting order
        for(int num:nums){
            set.add(num);
        }
        System.out.println(set);

//        set.add(null);
//        set.add(null);
        System.out.println(set);

        for(Integer num:nums){
            System.out.println(num);
        }
        Set<Integer> collect=list.stream().collect(Collectors.toSet());
        list.parallelStream().forEach(System.out::println);

        System.out.println(set.contains(5)); //almost O(1)

        TreeSet<Integer> treeSet=new TreeSet<>(set);
        System.out.println(treeSet);
    }
}
