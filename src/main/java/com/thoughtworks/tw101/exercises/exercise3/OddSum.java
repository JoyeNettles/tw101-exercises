package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    //  returns the sum of all odd integers between a starting and ending integer value.
    public int of(int start, int end) {
        int sum = 0;
        while(start<end+1){
            if (isOdd(start)) {
                sum += start; // adds to sum
            }
            start++;
        }
        return sum;
    }

    /*
 Checks to see if a number is odd
  */
    private static boolean isOdd(int number){
        boolean isOdd = false;
        if(number % 2 == 1 || number %2 == -1){
            isOdd = true;
        }
        return isOdd;
    }
}
