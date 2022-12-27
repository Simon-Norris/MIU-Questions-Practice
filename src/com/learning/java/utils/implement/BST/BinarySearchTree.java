package com.learning.java.utils.implement.BST;

public class BinarySearchTree {

    private Node parent;
    private int size = 0;

    BinarySearchTree(){
        this.parent = null;
    }

    static class Node{
        Node left;
        Node right;
        int data;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public void add(int data){
        if (this.size == 0) {
            this.parent = new Node(data);
            this.size++;
        } else {
            add(parent, new Node(data));
        }
    }

    public void add(Node parentNode, Node newNode){
        if (parentNode == null) return;

        if (parentNode.data < newNode.data) {
            if (parentNode.right == null) {
                parentNode.right = newNode;
                this.size++;
            } else add(parentNode.right, newNode);
        }

        if (parentNode.data > newNode.data) {
            if (parentNode.left == null) {
                parentNode.left = newNode;
                this.size++;
            } else add(parentNode.left, newNode);
        }
    }

    public void traverseLeft(){
        if (this.parent == null) return;
        System.out.println("Traversing from the left begun");
        Node node = this.parent;
        while (node.left != null && node.right != null) {
            System.out.println(node.data + " --> "+"["+node.left.data+" "+ node.right.data+"]");
            node = node.left;
        }
        System.out.println("Traverse Done");
    }

    public void traverseRight(){
        if (this.parent == null) return;
        System.out.println("Traversing from the right begun");
        Node node = this.parent;
        while (node.right != null && node.left != null) {
            System.out.println(node.data + " --> "+"["+node.left.data+" "+ node.right.data+"]");
            node = node.right;
        }
        System.out.println("Traverse Done");
    }

    public int highestValue(){
        if (this.size == 0) return -1;
        Node node = this.parent;
        while (node.right != null){
            node = node.right;
        }
        return node.data;
    }

    public int lowestValue(){
        if (this.size == 0) return -1;
        Node node = this.parent;
        while (node.left != null){
            node = node.left;
        }
        return node.data;
    }

    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(32);
        bst.add(50);
        bst.add(93);
        bst.add(3);
        bst.add(40);
        bst.add(17);
        bst.add(30);
        bst.add(38);
        bst.add(25);
        bst.add(78);
        bst.add(10);
        bst.traverseLeft();
        bst.traverseRight();
        System.out.println("Lowest Value in given bst is: "+ bst.lowestValue());
        System.out.println("Highest Value in given bst is: "+ bst.highestValue());
    }
}
