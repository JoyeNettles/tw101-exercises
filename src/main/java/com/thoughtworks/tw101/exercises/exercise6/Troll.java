package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by JOYE NETTLES on 6/1/2015.
 */
public class Troll implements Monster {
    private String name;
    private int currentHitpoints;

    public Troll(){
        this.name = "Troll";
        this.currentHitpoints = 40;
    }

    public void takeDamage(int amount){
        currentHitpoints -= amount;
    };

    public String name(){
        return name;
    };

    public int currentHitpoints(){
        return currentHitpoints;
    };

    public String toString(){
        return "Name: " + name + " Current Hitpoints: " + currentHitpoints;
    }
}
