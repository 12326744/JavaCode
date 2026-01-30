package com.work.inheritance;

public class FootballPlayer {
    String name;
    int age;
    int goal;
    int jerseyNum;
    int experience;
    int matchPlayer;
    boolean isCaptain;

    public FootballPlayer(String name, int age, int goal, int jerseyNum, int experience, int matchPlayer,
                          boolean isCaptain) {
        this.name = name;
        this.age = age;
        this.goal = goal;
        this.jerseyNum = jerseyNum;
        this.experience = experience;
        this.matchPlayer = matchPlayer;
        this.isCaptain = isCaptain;
    }

    void average(){
        System.out.println("Average "+ (goal/experience));
    }

    public String info() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", goal=" + goal +
                ", jerseyNum=" + jerseyNum +
                ", experience=" + experience +
                ", matchPlayer=" + matchPlayer +
                ", isCaptain=" + isCaptain +
                '}';
    }
}
