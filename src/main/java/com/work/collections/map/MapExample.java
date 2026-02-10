package com.work.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapExample {
    public static void main(String... args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Krishna");
        map.put(2,"Krish");
        map.put(3,"Laddu");
        map.put(2,"Aayush");

        System.out.println(map);  //key-value pair is called Entry

        System.out.println(map.keySet());// we call keySet because keys are unique

        Set<Integer> keys=map.keySet();
        Collection<String> values=map.values();

        map.remove(10);
        map.remove(2);
        System.out.println(map);
        System.out.println(map.get(0));
        System.out.println(map.get(1));







        //Hashing -- Keys
        //key -- Unique
        // Values -- Duplicate
    }
}
