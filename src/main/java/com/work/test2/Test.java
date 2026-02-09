package com.work.test2;

class Student {
    String name;
    int marks;
    static String college = "LPU";
    static final int MAXMARKS = 100;
    Student(String n, int m) {
        this.name = n;
        this.marks = m;
    }

    void printPercentage() {
        double percent = (marks * 100.0) / MAXMARKS;
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
        System.out.println("Marks Obtained: " + marks);
        System.out.println("Percentage: " + String.format("%.2f", percent) + "%");
        System.out.println();
    }
}

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 87);
        Student s2 = new Student("Ananya", 92);
        s1.printPercentage();
        s2.printPercentage();
    }
}
