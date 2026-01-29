package com.work.encapsulation;

public class Student {    //soem  fhdvrf vrj
    private int roll;
    private String name;

    Student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    String info(){
        return "Student{ " +
                "roll=" + roll +
                " , name='" + name + '\'' +
                '}';
    }
}
