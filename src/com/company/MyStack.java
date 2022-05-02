package com.company;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//Stack using 2 queue where Pop takes O(n) and push O(1)
//public class MyStack {
//
//    Queue<Integer> q1 = new LinkedList<>();
//    Queue<Integer> q2 = new LinkedList<>();
//    int top = 0;
//
//    /**
//     * Initialize your data structure here.
//     */
//    public MyStack() {
//
//    }
//
//    /**
//     * Push element x onto stack.
//     */
//    public void push(int x) {
//        q1.add(x);
//        top = x;
//    }
//
//    /**
//     * Removes the element on top of the stack and returns that element.
//     */
//    public int pop() {
//        while (q1.size() > 1) {
//            top = q1.remove();
//            q2.add(top);
//        }
//        Integer remove = q1.remove();
//        Queue temp = q1;
//        q1 = q2;
//        q2 = temp;
//        return remove;
//    }
//
//    /**
//     * Get the top element.
//     */
//    public int top() {
//        return top;
//    }
//
//    /**
//     * Returns whether the stack is empty.
//     */
//    public boolean empty() {
//        return q1.size() == 0;
//    }
//}

//Stack using 1 queue
public class MyStack {

    Queue<Integer> q1 = new LinkedList<>();

    /**
     * Initialize your data structure here.
     */
    public MyStack() {

    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        q1.add(x);
        int size = q1.size();
        while (size > 1){
            q1.add(q1.remove());
            size --;
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return q1.remove();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return q1.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return q1.isEmpty();
    }
}

