package com.work.inheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        C c=new C();
        System.out.println(c.x);
        c.test();
    }
}

class A{
    int x=10;
    private  int y=80;
}

class B extends A{
    int x=100;
}

class C extends B{
    int x=1000;

    void test(){
        System.out.println(x);
        System.out.println(super.x);   //super only access the immediate parent class
    }
}