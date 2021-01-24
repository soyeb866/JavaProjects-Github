package study.advance.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread{
	private String name; 
	
	
	public SomeThread(String name) {
		this.name = name;
	}


	@Override
	public void run() {
		System.out.println("Start the thread " + name);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End the thread "+ name);
	}
}

public class ThreadPool {

	public static void main(String[] args) {
		SomeThread thread1 = new SomeThread("Thread 1");
		SomeThread thread2 = new SomeThread("Thread 2");
		SomeThread thread3 = new SomeThread("Thread 3");
		SomeThread thread4 = new SomeThread("Thread 4");
		
		/*
		 * thread1.start(); thread2.start(); thread3.start(); thread4.start();
		 */
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		executorService.execute(thread1);
		executorService.execute(thread2);
		executorService.execute(thread3);
		executorService.execute(thread4);
		
		executorService.shutdown();
	}

}
