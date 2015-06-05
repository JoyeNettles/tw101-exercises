package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by JOYE NETTLES on 6/4/2015.
 */
public class NumberUtils {
    /*
        Generates a random number between a min and max
         */
    public static int getRandomInteger(int minimum, int maximum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }

    /*
    Determines if input is equal to random number
     */
    public static void notEqualToRandomNumber(int userInput, int randomNumber) {
        if (userInput > randomNumber) {
            System.out.println("Too High.");
        } else if (userInput < randomNumber) {
            System.out.println("Too Low.");
        }
    }
}
