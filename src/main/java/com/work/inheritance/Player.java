package com.work.inheritance;

public class Player {
    String name;
    int age;
    int experience;
    int matchPlayer;

    public Player(String name, int age, int experience, int matchPlayer) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.matchPlayer = matchPlayer;
    }

    public String info() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", matchPlayer=" + matchPlayer +
                '}';
    }
}
