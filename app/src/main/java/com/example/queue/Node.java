package com.example.queue;

public class Node {
    Node next;
   private int value;

    public Node(int value){
        this.value=value;
      //  this.next =null;

    }

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
