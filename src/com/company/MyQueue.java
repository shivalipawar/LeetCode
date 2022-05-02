package com.company;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    int front;
    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stack.empty())
            front = x;
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stack2.empty()){
            while (!stack.empty())
            {
                stack2.push(stack.pop());
            }
        }
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(!stack2.empty())
            return stack2.peek();
        return front;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return  stack.isEmpty() && stack2.empty();
    }
}

