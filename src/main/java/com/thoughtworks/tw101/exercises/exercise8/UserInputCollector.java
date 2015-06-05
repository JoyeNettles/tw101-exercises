package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

/**
 * Created by JOYE NETTLES on 6/4/2015.
 */
public class UserInputCollector {

    public static int getUserInput() throws NumberFormatException{
        int n = -3333333;
        Scanner scanner = new Scanner(System.in); // Instantiates scanner for input

        System.out.print("Guess a number:\t"); // Prompts for input
        String userInput  = scanner.next();
        try {
            n = Integer.valueOf(userInput);
        }catch(NumberFormatException e) {
            System.out.println("Input must be a number.");
            getUserInput();
        }
            return n;
    }
}
