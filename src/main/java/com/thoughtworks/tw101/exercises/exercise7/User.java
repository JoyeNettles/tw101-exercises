package com.thoughtworks.tw101.exercises.exercise7;

import java.util.ArrayList;

/**
 * Created by JOYE NETTLES on 6/5/2015.
 */
public class User {
    private ArrayList<Integer> userGuesses;

    public User(){
        userGuesses = new ArrayList<>();
    }

    /*
    Prints previous guesses
     */
    public String toString(){
        String guesses = "";
        for(int i=0; i< getUserGuesses().size(); i++){
            if(i != getUserGuesses().size()- 1) {
                guesses += getUserGuesses().get(i) + ", ";
            }else{
                guesses += getUserGuesses().get(i);
            }
        }

        return guesses;
    }

    public ArrayList<Integer> getUserGuesses() {
        return userGuesses;
    }

}
