package com.learning.java.utils.implement.LinkedList;

public class SimpleObjectLinkedList {
    Node head;
    int currentIndex;

    static class Node{
        Node next;
        Object data;

        public Node(Object data){
           this.next = null;
           this.data = data;
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Object getData(){
            return this.data;
        }
    }

    public void add(Object data){
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        Node currentNode = head;
        while (currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(node);
        this.currentIndex++;
    }

    public String toString(){
        String delimiter = ",";
        StringBuffer stringBuffer = new StringBuffer();
        if (head == null) return "LINKED LIST is empty";
        Node currentNode = head;
        while (currentNode != null) {
            stringBuffer.append(currentNode.getData());
            currentNode = currentNode.getNext();
            if (currentNode != null) stringBuffer.append(delimiter);
        }
        return stringBuffer.toString();
    }

    public Object get(Integer index){
        if (index < 0) return null;
        Node node = head;
        int currentIndex = 0;
        while (node != null) {
            if (currentIndex == index) return node.getData();
            node = node.getNext();
            currentIndex++;
        }
        return null;
    }

    public boolean remove(Integer index) {
        if (index < 0) return false;
        if (index == 0) {
            if (this.head.getNext() != null) {
                this.head = this.head.getNext();
                return true;
            }
            this.head = null;
            return false;
        }

        Node node = this.head;
        int currentIndex = 0;

        while (currentIndex != index-1) {
            if (node.getNext() == null) return false;
            node = node.getNext();
            currentIndex++;
        }
        node.setNext(node.getNext().getNext());
        return true;
    }


    public static void main(String[] args) {
        SimpleObjectLinkedList list = new SimpleObjectLinkedList();
        list.add("Abcd");
        list.add(39);
        list.add("efgh");
        list.add(133);
        list.add("ijkl");
        list.add(42);
        list.add("mnop");
        list.add(81);
        System.out.println(list.toString());
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(list.toString());
    }
}
