package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import com.thoughtworks.tw101.exercises.exercise8.NumberComparator;
import com.thoughtworks.tw101.exercises.exercise8.RandomNumberGenerator;
import com.thoughtworks.tw101.exercises.exercise8.UserInputCollector;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------- Random Number Game -----------------------"); //indicates user has guessed correctly
        int chosenNumber = RandomNumberGenerator.getRandomInteger(1, 100); // randomly generates number between 1 and 100
        ArrayList<Integer> userGuesses = new ArrayList<>();

        int n = UserInputCollector.getUserInput(); // retrieves user input
        userGuesses.add(n); // Adds user guess to arraylist

        while (n != chosenNumber) {
            NumberComparator.notEqualToRandomNumber(chosenNumber, n); // prints correct output after comparing user input to random number
            n = UserInputCollector.getUserInput();
            userGuesses.add(n); // Adds user guess to arraylist
            // TODO Figure out why its not adding first number to array after error input
        }

        // Prints out user guesses
        System.out.println("CORRECT!"); //indicates user has guessed correctly
        System.out.print("Your Guesses: \t");
        for(int i = 0; i<userGuesses.size(); i++) {
            if (userGuesses.get(i) != -3333333) {
                System.out.print(userGuesses.get(i) + " ");
            }
        }
    }
}
