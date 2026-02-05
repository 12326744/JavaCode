package com.work.design.patterns;

public class PrimeMinister {
    String name;
    int age;

    //declare a static private variable of the same class
    private static PrimeMinister pm;

    //make the constructor private
    private PrimeMinister(String name, int age) {
//    private PrimeMinister(String name, int age) {
        this.name = name;
        this.age = age;
    }


    //make static fn that will create an object
    static PrimeMinister declarePM(String name, int age){
        if(pm==null){
            pm=new PrimeMinister(name,age);
        }
        return pm;
    }

    @Override
    public String toString() {
        return "PrimeMinister{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
