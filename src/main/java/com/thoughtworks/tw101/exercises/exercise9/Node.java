package com.thoughtworks.tw101.exercises.exercise9;

/**
 * Created by JOYE NETTLES on 6/6/2015.
 */
public class Node {
        private String name; // value contained in a node
        private Node leftChild; // left child of a node
        private Node rightChild; // right child of a node

    /*
    Instantiates a Node
     */
        public Node(String name){
            this.name = name;

            this.leftChild = null;
            this.rightChild = null;
        }

    /*
    Adds a node to a tree
    @param value - the value of the node to add
    @return boolean - whether addition passed or failed
     */
    public boolean add(String value) {
        if (compareNewValueToCurrent(value, this.name) == 0) {
            return false;
        } else if (compareNewValueToCurrent(value, this.name) < 0) {
            if (leftChild == null) {
                leftChild = new Node(value);
                return true;
            } else
                return leftChild.add(value);
        } else {
            if (rightChild == null) {
                rightChild = new Node(value);
                return true;
            } else
                return rightChild.add(value);
        }
    }

    /*
    Compares string to add to the parent string
     */
    private int compareNewValueToCurrent(String newNode, String currentNode) {
        return newNode.compareTo(currentNode);
    }

    public String toString(){
        return "Node: " + this.name;
    }

    public String getName() {
        return name;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

}
