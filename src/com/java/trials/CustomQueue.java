package com.java.trials;

class Node{
    int value;
    Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

class Queue{

    Node front;
    Node rear;

    public void enqueue(int value){
        Node node = new Node(value, null);
        if(front ==  null){
            front = node;
            rear = node;
        }
        else{
            while (rear.next != null){
                rear = rear.next;
            }
            rear.next =  node;
            rear = node;
        }
    }

    public void dequeue(){
        if(front != null){
            Node temp = front.next;
            front.next = null;
            front = temp;
        }
    }

    public void display(){
        Node temp = front;
        while(temp != null){
            System.out.println(temp.value);
            temp =  temp.next;
        }
    }
}

public class CustomQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.display();
        queue.dequeue();
        System.out.println("After dequeue");
        queue.display();
    }
}
