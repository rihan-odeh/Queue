package com.example.queue;

public class LinkedListQueue {
    Node front, last;
    int size;
    public LinkedListQueue(){

        size=0;
    }
    public void enqueue(int value){
        Node newNode= new Node(value);
        if (this.last == null) {
            this.front = this.last = newNode;
            return;
        }

        last.next= newNode;
        last = newNode;


        size++;

    }
    public int dequeue(){
        Node current= front;
        if(front == null) return -1;
        if(!isEmpty()){
        front = front.getNext();
        }
        if (this.front == null)
            this.last = null;
      /*  else if(front==last){
            front = last= null;
        }*/
        size--;
   return current.getValue(); }

    public int getSize() {
        return size;
    }

    public int getFront() {
        return front.getValue();
    }

    public int getLast() {
        return last.getValue();
    }

    @Override
    public String toString() {
        return "LinkedListQueue{" +
                "front=" + getFront() +
                ", last=" + getLast() +
                ", size=" + size +
                '}';
    }
    public String print(){
        String s= " ";
        Node current = front;
        while(current !=null){
            s +=current.getValue();
            current= current.getNext();
        }
        if(current == null )
            s="ppp";
 return s;   }
  public boolean isEmpty(){
        if(size==0) return true;
   return false; }

}
