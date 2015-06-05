package com.thoughtworks.tw101.exercises.exercise8;

/**
 * Created by JOYE NETTLES on 6/4/2015.
 */
public class RandomNumberGenerator {
    /*
        Generates a random number between a min and max
         */
    public static int getRandomInteger(int minimum, int maximum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }
}
