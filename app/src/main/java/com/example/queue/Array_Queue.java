package com.example.queue;

import java.util.Arrays;

public class Array_Queue {
    private int[] queueArray;
    private int front, back, size;
    String string ="";

    public Array_Queue(){
        queueArray = new int[50];
        back=-1;
        front=-1;
        size =0;
    }
    public void enqueue(int value){
        queueArray[++back]= value;
        if(isEmpty()){ front++;}

        size++;
    }
    public int dequeue(){
        int fistElement= queueArray[front];
        front++;
        size--;
    return fistElement;}

    public int getSize() {
        return size;
    }

    public int getBack() {
        return queueArray[back];
    }

    public int getFront() {
        return queueArray[front];
    }

    @Override
    public String toString() {
        return "Array_Queue{" +
           //     "queueArray=" +  +Arrays.toString(queueArray)
                ", front=" + getFront() +
                ", back=" + getBack() +
                ", size=" + getSize() +
                '}';
    }
    public String printArray(){

        for (int i=front;i<=back;i++){
        string += "\t" +queueArray[i];
        } return string;
    }
    public boolean isEmpty(){
        if(size ==0){
            return true;
        }
  return false;  }
}
