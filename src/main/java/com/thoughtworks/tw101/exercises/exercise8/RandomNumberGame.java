package com.thoughtworks.tw101.exercises.exercise8;


import java.util.Scanner;

public class RandomNumberGame {
    private int chosenNumber; // Randomly generator number to guess
    private User user; // current player
    private Scanner scanner = new Scanner(System.in); // Instantiates scanner for input
    private boolean wonGame;

    /*
    Initializes game
     */
    public RandomNumberGame(){
        user = new User();
        chosenNumber = NumberUtils.getRandomInteger(1, 100); // randomly generates number between 1 and 100

        System.out.println("----------------------- Random Number Game -----------------------");
    }

    /*
    Starts the game
     */
    public void playGame(){
        do{

                int userGuess = getUserGuess();
     if(userGuess != -100) {
         user.getUserGuesses().add(userGuess); // adds guess to user's arraylist
         isWinner(userGuess, chosenNumber);
     }
        }while(!wonGame);
    }

    /*
    Prompts user for a guess
     */
    public int getUserGuess() throws NumberFormatException{
            int n = -100;

            System.out.print("Guess a number between 1 and 100:\t"); // Prompts for input

        try {
            n = Integer.valueOf(scanner.next());
        }catch(NumberFormatException e){
            System.out.println("Only numbers please.");
        }
            return n;
    }

    /*
    Checks to see if user is a winner
     */
    public void isWinner(int userGuess, int randomNumber){
        if(userGuess == randomNumber){
            wonGame = true;
        }else{
            NumberUtils.notEqualToRandomNumber(userGuess, randomNumber);
            wonGame = false;
        }
    }

    /*
    Ends game
     */
    public void endGame(){
        System.out.println("----------------------- YOU WIN!!! -----------------------");
        System.out.println(chosenNumber + " is correct!");
        System.out.println("Guesses: " + user.toString());
    }

//    public static void main(String[] args) {


//        int n = UserInputCollector.getUserInput(); // retrieves user input
//
//        while(n != chosenNumber) {
//            NumberComparator.notEqualToRandomNumber(chosenNumber, n); // prints correct output after comparing user input to random number
//            n = UserInputCollector.getUserInput();
//        }
//            System.out.println("CORRECT!"); //indicates user has guessed correctly
//        }

}

