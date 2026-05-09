package com.firealgo.javaadvancedconcept.thread.interthreadcommunication.runningTwoThreadsAlternate;

import java.util.concurrent.Semaphore;

public class ThreadPrinter implements Runnable {
    int counter;
    Semaphore ins, outs;

    public ThreadPrinter(int counter, Semaphore ins, Semaphore outs) {
        this.counter = counter;
        this.ins = ins;
        this.outs = outs;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                ins.acquire(); // wait for permission to run
                System.out.println(counter + " by " + Thread.currentThread().getName());
                outs.release(); // allow another thread to run
                counter += 2;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
