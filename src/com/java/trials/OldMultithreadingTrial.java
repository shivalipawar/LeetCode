package com.java.trials;

public class OldMultithreadingTrial {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Demo());
        t1.start();
        t1.start();
        System.out.println("In main class");
    }
}

class Demo implements Runnable{
    @Override
    public void run() {
        System.out.println("Running");
    }

}

class Demo2 extends Thread implements Runnable{
    @Override
    public void run(){
        System.out.println("Run demo1");
    }

    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.run();
        d.start();
        System.out.println("Will it run?");
    }
}
