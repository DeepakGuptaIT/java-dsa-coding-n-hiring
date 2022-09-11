package com.firelago.java.threads;

public class ThreadUsingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createThread();

	}
	
	private static void createThread() {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println("Run me !!");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("completed");
				
			}
			
		},"threadOne");
		t1.start();
		t1.start();//it can never be started again
	}

}
