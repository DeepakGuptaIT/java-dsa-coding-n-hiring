package com.firealgo.javaadvancedconcept.thread.waitNotify;

public class OddEvenPrinter {

    private int number = 1;
    private final int MAX = 10;

    public synchronized void printOdd() {
        while (number <= MAX) {

            // If number is even, odd thread should wait
            while (number % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            if (number <= MAX) {
                System.out.println(
                    Thread.currentThread().getName() + " : " + number
                );

                number++;

                // Wake up waiting threads
                notifyAll();
            }
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {

            // If number is odd, even thread should wait
            while (number % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            if (number <= MAX) {
                System.out.println(
                    Thread.currentThread().getName() + " : " + number
                );

                number++;

                // Wake up waiting threads
                notifyAll();
            }
        }
    }

    public static void main(String[] args) {

        OddEvenPrinter printer = new OddEvenPrinter();

        Thread oddThread =
                new Thread(printer::printOdd, "Odd Thread");

        Thread evenThread =
                new Thread(printer::printEven, "Even Thread");

        oddThread.start();
        evenThread.start();
    }
}