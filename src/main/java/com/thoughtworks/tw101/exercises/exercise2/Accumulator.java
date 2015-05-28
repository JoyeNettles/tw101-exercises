package com.thoughtworks.tw101.exercises.exercise2;

/*
Counts the number of times a method is called
 */
public class Accumulator {
    private int total; // stores number of times method is called

    /*
    Prints the total number of times a method was called
     */
    public void total(){
        System.out.println("Total: " + total);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
