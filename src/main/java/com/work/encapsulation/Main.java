package com.work.encapsulation;

public class Main {
    public static void main(String[] args) {
        Student st1=new Student(3,"Krishna");
        System.out.println(st1.info());
        System.out.println(st1.getName());
        System.out.println(st1.getRoll());
        st1.setRoll(99);
        System.out.println(st1.info());


        Employee employee=new Employee("Krishna Sah",
                101,
                "Tech Solutions",
                true, 50000, 9876543210L);
        System.out.println(employee);

        Car c1=new Car("TOYOTA","KA 6788",5.6f);
        System.out.println(c1.getName());



    }
}
