package com.work.static_concept;

public class Main {
    public static void main(String[] args) {
        Student st1=new Student(56,"Krishna","LPU");
        System.out.println(st1.info());
        System.out.println(st1.collegeName);

        Student st2=new Student(21,"krish","Dtu");
        System.out.println(st2.info());
        System.out.println(st2.collegeName);

        System.out.println(st1.collegeName);

    }
}
