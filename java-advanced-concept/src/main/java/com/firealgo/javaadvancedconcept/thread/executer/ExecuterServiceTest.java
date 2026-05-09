package com.firealgo.javaadvancedconcept.thread.executer;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ExecuterServiceTest {
	public static void main(String[] args) {
		try {
//			demo1();
//			demo2();
//			ScheduledExecutorServiceDemo();
//			ScheduledExecutorServiceRepeatDemo();
			ScheduledExecutorServiceRepeatDemo2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void ScheduledExecutorServiceRepeatDemo2() throws InterruptedException {
		// TODO Auto-generated method stub
		CountDownLatch lock = new CountDownLatch(8);
		ScheduledExecutorService ex = Executors.newScheduledThreadPool(5);
		ScheduledFuture<?> future = ex.scheduleAtFixedRate(()-> {
			System.out.println("Hello Repeat again!!");
			lock.countDown();
		}, 500, 500, TimeUnit.MILLISECONDS);
		System.out.println("outside the service");
		lock.await();
		future.cancel(true);
		
	}

	private static void ScheduledExecutorServiceRepeatDemo() throws InterruptedException {
		// TODO Auto-generated method stub
		CountDownLatch lock = new CountDownLatch(3);

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
		ScheduledFuture<?> future = executor.scheduleAtFixedRate(() -> {
		    System.out.println("Hello World Repeat");
		    lock.countDown();
		}, 500, 500, TimeUnit.MILLISECONDS);

		lock.await(1000, TimeUnit.MILLISECONDS);
		future.cancel(true);
		
	}

	private static void ScheduledExecutorServiceDemo() {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
		executor.schedule(() -> {
		    System.out.println("Hello World");
		}, 500, TimeUnit.MILLISECONDS);
		
	}

	private static void demo2() throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newFixedThreadPool(5);
		Future<String> future = ex.submit(() -> "Hello Friend");
		System.out.println(future.get());
		
	}

	private static void demo1() throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Future<String> future = executorService.submit(() -> "Hello World");
		// some operations
		String result = future.get();
		System.out.println(result);
	}

}
