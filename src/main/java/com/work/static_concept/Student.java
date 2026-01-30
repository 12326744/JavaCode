package com.work.static_concept;

public class Student {
    int id ;
    String name;
    static String collegeName;

    static {
        System.out.println("Static block 1");
        collegeName="VIT";

    }

    public Student(int id, String name,String college) {
        this.id = id;
        this.name = name;
        collegeName=college;
    }

    public String info() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
