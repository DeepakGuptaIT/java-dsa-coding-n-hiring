package com.firealgo.javaadvancedconcept.thread.virtualThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo1 {
    public static void main(String[] args) {
//        op1();
        op2();
    }

    private static void op1() {
        try(ExecutorService executorService  = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 5; i++) {
                int taskId = i;
                executorService.submit(() -> {
                    System.out.println("Thread: "+ taskId);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
        }
    }
    private static void op2() {
        try(ExecutorService executorService  = Executors.newFixedThreadPool(2)) {
            for (int i = 0; i < 5; i++) {
                int taskId = i;
                executorService.submit(() -> {
                    System.out.println("Thread: "+ taskId);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
        }
    }
}
