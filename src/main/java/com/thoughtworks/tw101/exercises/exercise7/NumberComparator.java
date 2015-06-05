package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by JOYE NETTLES on 6/4/2015.
 */
public class NumberComparator {

    public static void notEqualToRandomNumber(int randomNumber, int userInput) {
        if (userInput > randomNumber) {
            System.out.println("Too High.");
        } else if (userInput < randomNumber) {
            System.out.println("Too Low.");
        }
    }
}
