package com.java.trials.designpattern;

public class SingletonWithoutSynchronized {
    public static void main(String[] args) {
        TrainNoSync t1 = TrainNoSync.getInstance();
        TrainNoSync t2 = TrainNoSync.getInstance();
        t1.setName("Chennai express");
        t1.setNumber(0012);
        System.out.println(t1==t2);
    }
}

class TrainNoSync{

    String name;
    int number;

    private TrainNoSync(){}

    private static class HoldInstance{
        private static final TrainNoSync instance = new TrainNoSync();
    }

    public static TrainNoSync getInstance(){
        return HoldInstance.instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
