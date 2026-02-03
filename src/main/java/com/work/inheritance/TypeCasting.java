package com.work.inheritance;

public class TypeCasting {
    public static void main(String[] args) {
        Child c1 = new Child();
        System.out.println(c1.x);
        System.out.println(c1.y);
        c1.fun1();
        c1.fun2();

        Parent p1 = c1;  // upcasting---converting a child class object into a parent class reference.
//      Parent p1 = new Child();  // also upcasting

        System.out.println(p1.x);
//        System.out.println(p1.y);  // Not allowed---cannot allowed to call the child members.
        p1.fun1();

        // Safe down casting using instanceof
        if (p1 instanceof Child) {
            Child c = (Child) p1;   // down casting---converting a parent class reference back into a child class reference.
            c.fun1();
            c.fun2();
        }
    }
}

class Parent {
    int x = 8;
    void fun1() {
        System.out.println("fun 1");
    }
}

class Child extends Parent {
    int y = 9;
    void fun2() {
        System.out.println("fun 2");
    }
}
