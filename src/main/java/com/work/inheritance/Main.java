package com.work.inheritance;

public class Main {
    public static void main(String[] args) {
         Football2 ronaldo=  new Football2("Ronaldo",55,5,122,
                 320,7,false);

        System.out.println(ronaldo.name);
        System.out.println(ronaldo.jerseyNum);
        System.out.println(ronaldo.experience);
        System.out.println(ronaldo.matchPlayer);
        System.out.println(ronaldo.goal);
        System.out.println(ronaldo.isCaptain);
        System.out.println(ronaldo.age);
        //private things are not inherited

    }
}
