package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {

    /*
    Checks to see if a number is odd
     */
        private static boolean isOdd(int number){
            boolean isOdd = false;
            if(number % 2 == 1){
                isOdd = true;
            }
            return isOdd;
        }


    public static void main(String[] args) {
        System.out.print("Odd NumberUtils: ");
        int sum = 0;

        for (int i = 1; i < 101; i++) {
            if (isOdd(i)) {
                System.out.print(i + ", "); // Prints odd number
                sum += i; // adds to sum
            }
        }
        System.out.println();
        System.out.println("Sum: " + sum);

    }
}
