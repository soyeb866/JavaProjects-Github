package study.advance.multithreading;

import java.util.concurrent.CountDownLatch;



class SomeThread2 extends Thread{
	
	private CountDownLatch latch;

	public SomeThread2(CountDownLatch latch) {
		this.latch = latch;
	}
	
	@Override
	public void run() {
		System.out.println("Thread running with thread name " 
	+ Thread.currentThread().getName());
		System.out.println("Thread execution completed!");
		System.out.println("***********************");
		
		latch.countDown();
	}
	
	
}

public class CountDownLatchThread {

	public static void main(String[] args) {
		
		CountDownLatch latch = new CountDownLatch(4);
		
		SomeThread2 thread1 = new SomeThread2(latch);
		SomeThread2 thread2 = new SomeThread2(latch);
		SomeThread2 thread3 = new SomeThread2(latch);
		SomeThread2 thread4 = new SomeThread2(latch);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("I am in " + Thread.currentThread().getName());
	}

	

}
