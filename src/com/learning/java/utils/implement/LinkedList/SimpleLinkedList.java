package com.learning.java.utils.implement.LinkedList;

public class SimpleLinkedList {
    Node head;

    static class Node {
        Integer data;
        Node next;

        Node(Integer data){
            this.data = data;
            this.next = null;
        }

        Node getNext(){
            return this.next;
        }

        void setNext(Node node){
            this.next = node;
        }

        Object getData(){
            return  this.data;
        }
    }

    public void add(Integer element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(newNode);
    }

    public String toString() {
        String delim = ",";
        StringBuffer stringBuffer = new StringBuffer();
        if (head ==  null) return "LINKED LIST is empty";
        Node currentNode = head;
        while (currentNode != null) {
            stringBuffer.append(currentNode.getData());
            currentNode = currentNode.getNext();
            if (currentNode != null) stringBuffer.append(delim);
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args){
        SimpleLinkedList list = new SimpleLinkedList();
        list.add(13);
        list.add(39);
        list.add(133);
        list.add(42);
        list.add(81);
        list.add(55);
        System.out.println(list);
    }
}
