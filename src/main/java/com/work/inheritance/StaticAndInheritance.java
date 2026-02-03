package com.work.inheritance;

public class StaticAndInheritance {
    public static void main(String[] args) {
        Sample2 sample2=new Sample2();
        System.out.println(sample2.x);
        System.out.println(sample2.x);
        System.out.println(Sample1.x);
        sample2.callMe();

//        sample2.callMe();
//        Sample1.callMe();
    }
}
class Sample1{
    static int x= 9;

    static void callMe(){
        System.out.println("Calling from static 1");
    }
}
class Sample2 extends Sample1{
    static void callMe(){
        System.out.println("Calling from static 2");
    }

}