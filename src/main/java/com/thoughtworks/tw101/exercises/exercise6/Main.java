package com.thoughtworks.tw101.exercises.exercise6;

// Exercise #6: Create Orc and Troll classes that implement a Monster interface with takeDamage(int amount),
// String name(), and int currentHitpoints() methods. Store instances of both classes and store them in an ArrayList.
// Iterate through the list and make each monster take 10 points of damage. After you have damaged all of the monsters,
// report the name and current hit points of all monsters.
// * Orcs are named “Orc” and have 20 initial hitpoints
// * Trolls are named “Troll”, have 40 hit points and only take half damage

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Monster> monsters = new ArrayList<Monster>();
        addMonstersToArrayList(monsters, 20);

        //  Damages monsters by 10
        for(int i =0; i<monsters.size(); i++){
            monsters.get(i).takeDamage(10);
        }

        // Reports on the monsters
        for(int i=0; i<monsters.size(); i++){
            System.out.println(monsters.get(i).toString());
        }

    }

    /*
    Adds an equal number of orcs and trolls to an arraylist.
    @param monsters the arraylist that holds the monsters
    @param monstersToCreate number of each monster to create
     */
    private static void addMonstersToArrayList(ArrayList<Monster> monsters, int monstersToCreate) {
        for(int i=0; i<monstersToCreate; i++) {
            Orc orc = new Orc();
            Troll troll = new Troll();

            monsters.add(orc);
            monsters.add(troll);
        }
    }
}
