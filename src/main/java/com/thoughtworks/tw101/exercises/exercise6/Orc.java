package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by JOYE NETTLES on 6/1/2015.
 */
public class Orc implements Monster {
    private String name;
    private int currentHitpoints;

    public Orc(){
        this.name = "Orc";
        this.currentHitpoints = 20;
    }

    public void takeDamage(int amount){

    };

    public String name(){
        return null;
    };

    public int currentHitpoints(){
        return -1;
    };

}
