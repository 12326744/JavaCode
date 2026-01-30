package com.work.inheritance;

public class Football2 extends Player{

    int goal;
    int jerseyNum;
    boolean isCaptain;

    public Football2(String name, int age, int experience, int matchPlayer, int goal, int jerseyNum,
                     boolean isCaptain) {
        super(name, age, experience, matchPlayer);
        this.goal = goal;
        this.jerseyNum = jerseyNum;
        this.isCaptain = isCaptain;
    }
}
