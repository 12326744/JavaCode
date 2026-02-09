package com.work.wrapperclass;

public class IntegerObjects {
    public static void main(String[] args) {
        Integer a=100;
        Integer b=100;
        System.out.println(a==b);  //Print TRUE (They point to the same object)

        Integer x=200;
        Integer y=200;
        System.out.println(x==y);  //Print FALSE (They are two different objects on the heap)  - it checks the memory address
        System.out.println(x.equals(y));  // print TRUE  -- it checks the value

        Double d1=1.0;
        Double d2=1.0;
        System.out.println(d1 == d2); //Always FALSE---it check the memory address
        System.out.println(d1.equals(d2)); //TRUE -- it check the value

        System.out.println(Boolean.TRUE == Boolean.TRUE);

    }
}
