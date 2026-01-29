package com.work.encapsulation;

public class Main {
    public static void main(String[] args) {
        Student st1=new Student(3,"Krishna");
        System.out.println(st1.info());
        System.out.println(st1.getName());
        System.out.println(st1.getRoll());
        st1.setRoll(99);
        System.out.println(st1.info());
    }
}
