package study.advance.multithreading;

import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable{

	private ArrayBlockingQueue<Integer> queue;
	
	
	
	public Producer(ArrayBlockingQueue<Integer> queue) {
		this.queue = queue;
	}



	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(5000);
				queue.put(BlockingQueueThread.counter++);
				System.out.println("Value added in ther queue " + BlockingQueueThread.counter);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
	}
	
}

class Consumer implements Runnable{

	private ArrayBlockingQueue<Integer> queue;
	
	
	
	public Consumer(ArrayBlockingQueue<Integer> queue) {
		this.queue = queue;
	}



	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				queue.take();
				BlockingQueueThread.counter--;
				System.out.println("Value remove in ther queue " + BlockingQueueThread.counter);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
	}
	
}

public class BlockingQueueThread {
	
	static int counter = 0;
	
	public static void main(String[] args) {
		 ArrayBlockingQueue<Integer> queue =  new ArrayBlockingQueue<Integer>(5);
		 Producer producer = new Producer(queue);
		 Thread producedThread = new Thread(producer);
		 producedThread.start();

		 Consumer consumer = new Consumer(queue);
		 Thread consumerThread = new Thread(consumer);
		 consumerThread.start();
		 
		 System.out.println("I am in main thread");
	}

}
