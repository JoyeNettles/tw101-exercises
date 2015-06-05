package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

import com.thoughtworks.tw101.exercises.exercise7.NumberComparator;
import com.thoughtworks.tw101.exercises.exercise7.RandomNumberGenerator;
import com.thoughtworks.tw101.exercises.exercise7.UserInputCollector;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------- Random Number Game -----------------------"); //indicates user has guessed correctly

        int chosenNumber = RandomNumberGenerator.getRandomInteger(1, 100); // randomly generates number between 1 and 100

        int n = UserInputCollector.getUserInput(); // retrieves user input

        while(n != chosenNumber) {
            NumberComparator.notEqualToRandomNumber(chosenNumber, n); // prints correct output after comparing user input to random number
            n = UserInputCollector.getUserInput();
        }
            System.out.println("CORRECT!"); //indicates user has guessed correctly
        }

}

