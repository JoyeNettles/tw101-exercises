package com.thoughtworks.tw101.exercises.exercise9;

public class BinarySearchTree {

    private Node root = null; // root of the tree

    /*
    Instantiates a new tree
    @param rootNode - the root of the tree
     */
    public BinarySearchTree(Node rootNode) {
        root = rootNode;
    }

    /*
    Recursively finds a place to add a new node
    @param nameOfNewNode - the value contained in the new node
    @result boolean - true if addition successful, false if not
     */
    public boolean add(String nameOfNewNode) {
        Node nodeToAdd = new Node(nameOfNewNode);

        if(root==null){
            root = nodeToAdd;
            return true;
        }else {
            return root.add(nameOfNewNode);
        }
    }

    /*
    Recursively prints the name of all of the nodes in alphabetical order by traversing the list in order
    TODO: Figure out how to add the names to a List<String>
     */
    public void names() {
       inOrderTreeTraversal(root);
    }

    /*
    Traverses tree in order
    */
    public void inOrderTreeTraversal(Node focusNode){
        if(focusNode != null){
            inOrderTreeTraversal(focusNode.getLeftChild());
            System.out.println(focusNode.getName()); // prints out "root"
            inOrderTreeTraversal(focusNode.getRightChild());

        }
    }

}
