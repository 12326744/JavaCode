package com.work.inheritance;

public class IplPlayer {
    String name;
    int age;
    int runs;
    int jerseyNum;
    int experience;
    int matchPlayer;
    boolean isAllRounder;
    boolean isCaptain;

    public IplPlayer(String name, int age, int runs, int jerseyNum, int experience,int matchPlayer,
                     boolean isAllRounder, boolean isCaptain) {
        this.name = name;
        this.age = age;
        this.runs = runs;
        this.jerseyNum = jerseyNum;
        this.experience = experience;
        this.matchPlayer=matchPlayer;
        this.isAllRounder = isAllRounder;
        this.isCaptain = isCaptain;
    }

    void average(){
        System.out.println("Average "+ (runs / matchPlayer));
    }

    public String info() {
        return "IplPlayer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", runs=" + runs +
                ", jerseyNum=" + jerseyNum +
                ", experience=" + experience +
                ", matchPlayer=" + matchPlayer +
                ", isAllRounder=" + isAllRounder +
                ", isCaptain=" + isCaptain +
                '}';
    }

}
