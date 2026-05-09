package com.firealgo.javaadvancedconcept.thread.interthreadcommunication.runningTwoThreadsAlternate;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore a = new Semaphore(1); // first thread is allowed to run immediately
        Semaphore b = new Semaphore(0); // second thread has to wait
        ThreadPrinter tp1 = new ThreadPrinter(1, a, b);
        ThreadPrinter tp2 = new ThreadPrinter(2, b, a);
        new Thread(tp1).start();
        new Thread(tp2).start();
    }
}
