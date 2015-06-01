package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    // Prints out all of the books in the Library whose title contains the string passed in.
    public String printBooksContaining(String partialBookTitle) {
        String bookTitles = "";

        System.out.println("Containing '" + partialBookTitle + "': ");

        for(String book: books){
            if(book.contains(partialBookTitle)){
                bookTitles += book + ", ";
                System.out.println(book);
            }
        }
        System.out.println();

        return bookTitles;
    }
}
