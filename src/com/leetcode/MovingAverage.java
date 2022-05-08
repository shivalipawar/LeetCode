package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {

    private Queue queue;
    private int maxSize;
    private double sum = 0.0;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        queue = new LinkedList<Integer>();
        maxSize = size;
        sum = 0.0;
    }

    public double next(int val) {
        if(queue.size() == maxSize){
            //Remove the first element from window and sum;
            sum -= (int)queue.remove();
        }
        queue.add(val);
        sum += val;
        return sum/ queue.size();
    }
}
