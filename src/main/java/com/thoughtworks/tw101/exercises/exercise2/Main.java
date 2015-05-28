package com.thoughtworks.tw101.exercises.exercise2;

// Exercise #2: Create a class that counts how many times you call the method increment() and prints out that number
// when you call total(). Create a main method that calls increment() 5 times and then calls total().

public class Main {

    /*
    Increases the total number of methods called by one
    @param accumulator used to update the total of the accumulator instance
    */
    public static void increment(Accumulator accumulator){
        accumulator.setTotal(accumulator.getTotal() +1);
    }

    public static void main(String[] args) {

        Accumulator accumulator = new Accumulator();

        // Calls increment five times
        for(int i=0; i<5; i++){
            increment(accumulator);
        }

        accumulator.total(); //Prints the total number of times increment is called
    }
}
