package com.thoughtworks.tw101.exercises.exercise9;

// Exercise #9: Create a class BinarySearchTree that implements a binary tree for Strings. It should have an add(String name) method
// that recursively finds the correct place to add a new node and a names() method that returns the names of all of the
// nodes in alphabetical order (this should also be implemented using recursion).

public class Main {
    public static void main(String[] args) {
        Node rootNode = new Node("Cecil");
        BinarySearchTree binarySearchTree = new BinarySearchTree(rootNode);

        binarySearchTree.add("Cecil"); // tests adding duplicates into a tree
        binarySearchTree.add("Michelle");
        binarySearchTree.add("Bill");
        binarySearchTree.add("Jagruti");
        binarySearchTree.add("Tess");
        binarySearchTree.add("Sue-Ellen");
        binarySearchTree.add("Sara");
        binarySearchTree.add("Casey");
        binarySearchTree.add("Zoey");
        binarySearchTree.add("Jordan");
        binarySearchTree.add("Adam");

        System.out.println("-------------------------------- Your Tree --------------------------------");
        binarySearchTree.names();

    }
}
