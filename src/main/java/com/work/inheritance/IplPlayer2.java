package com.work.inheritance;

public class IplPlayer2 extends Player{

    int runs;
    int matchPlayer;
    boolean isCaptain;

    public IplPlayer2(String name, int age,
                      int experience, int matchPlayer, int runs, int matchPlayer1, boolean isCaptain) {
        super(name, age, experience, matchPlayer);  // super call to the immediate parent constructor should be the 1st statement
//        this(name, age, experience, matchPlayer);  //dont put super and this
//        in the same constructor as they will fight for the 1st statement
        this.runs = runs;
        this.matchPlayer = matchPlayer1;
        this.isCaptain = isCaptain;
    }

    void average(){
        System.out.println("Average: "+(runs/matchPlayer));
    }
}
