package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by JOYE NETTLES on 6/1/2015.
 */
public interface Monster {

    public void takeDamage(int amount);

    public String name();

    public int currentHitpoints();

    public String toString();

}
