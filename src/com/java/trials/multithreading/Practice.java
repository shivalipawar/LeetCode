package com.java.trials.multithreading;

class ThreadDemo implements Runnable {

    int printNumberUptoTen = 10;
    static int counter = 1;
    int remainder;
    static Object lock = new Object();

    ThreadDemo(int remainder) {
        this.remainder = remainder;
    }

    @Override
    public void run() {
        while (counter < printNumberUptoTen - 1) {
            synchronized (lock) {
                while (counter % 3 != remainder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + counter);
                counter++;
                lock.notifyAll();
            }
        }
    }
}

public class Practice {
    public static void main(String[] args) {
        ThreadDemo td1 = new ThreadDemo(1);
        ThreadDemo td2 = new ThreadDemo(2);
        ThreadDemo td3 = new ThreadDemo(0);

        Thread t1 = new Thread(td1, "T1");
        Thread t2 = new Thread(td2, "T2");
        Thread t3 = new Thread(td3, "T3");

        t1.start();
        t2.start();
        t3.start();
    }
}
