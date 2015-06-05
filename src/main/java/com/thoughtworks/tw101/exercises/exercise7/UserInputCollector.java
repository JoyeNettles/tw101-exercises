package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by JOYE NETTLES on 6/4/2015.
 */
public class UserInputCollector {

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in); // Instantiates scanner for input
        int n;

        System.out.print("Guess a number:\t"); // Prompts for input
        while (!scanner.hasNextInt()) { // Checks to see if input is an integer
            System.out.print("Enter a number please: \t");
            scanner.next();
        }

        n = scanner.nextInt();
        return n;
    }
}
