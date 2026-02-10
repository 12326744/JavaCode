package com.work.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        int[] nums={56,45,878,5,6};

        //All the collection accept only object type
        ArrayList list=new ArrayList<>();
        list.add(56);
        list.add("Hey");
        list.add(8.2);
        list.add(true);
        System.out.println(list);

        //it is forcing to store only the integer type
        ArrayList<Integer> listOfNums=new ArrayList<>();
        listOfNums.add(56);
        listOfNums.add(25);
        listOfNums.add(8);
        listOfNums.add(89);
        System.out.println(listOfNums);

        listOfNums.remove(2);
        System.out.println(listOfNums);

//        listOfNums.add(null);
//        System.out.println(listOfNums);

        listOfNums.set(2,69);
        System.out.println(listOfNums);

        listOfNums.add(2,699);
        System.out.println(listOfNums);

        for (int i=0;i<listOfNums.size();i++){
            System.out.print(listOfNums.get(i)+" ");
        }

        for (Integer num:listOfNums){
            System.out.print(num+" ");
        }

        Iterator<Integer> iterator=listOfNums.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        // TODO Research on looping from last to first in listOfNumbs

        listOfNums.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        if(listOfNums.isEmpty()){
            System.out.println("Empty");
        }
        System.out.println(listOfNums.get(0));
        System.out.println(listOfNums.get(listOfNums.size()-1));

        System.out.println(listOfNums.getFirst());
        System.out.println(listOfNums.getLast());

        List<Integer> list2= List.of(54,65,4,35);
        listOfNums.addAll(list2); //TODO see how you can truly merge two lists
        System.out.println(listOfNums);
        listOfNums.clear();

    }
}


