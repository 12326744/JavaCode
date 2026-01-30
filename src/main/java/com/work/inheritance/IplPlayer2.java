package com.work.inheritance;

public class IplPlayer2 extends Player{

    int runs;
    int matchPlayer;
    boolean isCaptain;

    public IplPlayer2(String name, int age,
                      int experience, int matchPlayer, int runs, int matchPlayer1, boolean isCaptain) {
        super(name, age, experience, matchPlayer);
        this.runs = runs;
        this.matchPlayer = matchPlayer1;
        this.isCaptain = isCaptain;
    }
}
