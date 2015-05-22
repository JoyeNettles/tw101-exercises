package com.thoughtworks.tw101.exercises.introProgrammingAssignments;

import java.util.Scanner;

/**
 * Created by JOYE NETTLES on 5/22/2015.
 * This class is used to complete the programming assignments given in Part One on Moodle.
 */
public class introProgrammingAssignmentsPartOne {

    // Exercise #1: Print one asterisk to the console.
    public static void printOneAsterisk(){
        System.out.print("*");
    }

    //Exercise #2: Print n asterisks in a horizontal line
    public static void drawAHorizontalLine(int n){
        for(int i=0; i<n; i++ ) {
            printOneAsterisk();
        }
    }

    //Exercise #3: Print n asterisks in a vertical line
    public static void drawAVerticalLine(int n){
        for(int i=0; i<n; i++ ) {
            printOneAsterisk();
            System.out.println();
        }
    }

    //Exercise #4: Prints a right triangle with the base the size of n
    public static void drawARightTriangle(int n){
        for(int rowIndex=1; rowIndex<n+1; rowIndex++ ) {
            drawAHorizontalLine(rowIndex);
            System.out.println();
        }
    }

    //Exercise #5: Given a number n, print a centered triangle
    public static void drawAnIsoscelesTriangle(int n){
        int rowCounter = 0;
        for(int rowIndex=3; rowIndex > 0; rowIndex-- ) {
            printSpaceForCentering(rowIndex-1);

            drawAHorizontalLine(n+rowCounter);

            printSpaceForCentering(rowIndex-1);

            System.out.println();

            rowCounter+=2;

        }
    }

    private static void printSpaceForCentering(int sideSpaces) {
        for(int spaceCtr = 0; spaceCtr < sideSpaces; spaceCtr++){
            System.out.print(" ");
        }
    }

    // Runs the various assignments
        public static void main(String[] args) {
            int n; // Input number

          System.out.println("--------------- TRIANGLE  EXERCISES ---------------");

            System.out.println("Exercise #1: Print one asterisk to the console.");
            printOneAsterisk();
            printFormatting();

            System.out.println("Exercise #2: Print n asterisks in a horizontal line.");
            n = getN();
            drawAHorizontalLine(n);
            printFormatting();

            System.out.println("Exercise #3: Print n asterisks in a vertical line.");
            n = getN();
            drawAVerticalLine(n);
            printFormatting();

            System.out.println("Exercise #4: Prints a right triangle with the base the size of n.");
            n = getN();
            drawARightTriangle(n);
            printFormatting();

            System.out.println("--------------- DIAMOND  EXERCISES ---------------");

            System.out.println("Exercise #5: Given a number n, print a centered triangle.");
            n = getN();
            drawAnIsoscelesTriangle(n);
            printFormatting();

        }

    private static void printFormatting() {
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();
    }

    private static int getN() {
        Scanner scanner = new Scanner(System.in); // Instantiates scanner for input
        int n;

        System.out.print("Input number greater than 0? \t");
            while (!scanner.hasNextInt()) {
                System.out.print("Enter a number please: \t");
                scanner.next();
            }

        n = scanner.nextInt();

        //TODO: Don't allow zeroes
        if(n==0) {
            n = 1;
        }
        return n;
    }
}
