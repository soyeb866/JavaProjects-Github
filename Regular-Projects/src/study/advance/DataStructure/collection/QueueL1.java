package study.advance.DataStructure.collection;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueL1 {

	public static void main(String[] args) {
		
		//Queue<Integer> queue = new LinkedBlockingQueue<>();
		Queue<Integer> queue = new ArrayBlockingQueue<>(6);
	
		
	/*	
		try {
			queue.remove();
			queue.remove();
		} catch (NoSuchElementException e) {
			System.out.println("Queue is empty. So no remove occured! or first element occured.");
		}
		
		
		try {
			queue.add(10);
			queue.add(2);
			queue.add(3);
			queue.add(4);
			queue.add(5);
			queue.add(6);
			queue.add(7);
		}
		catch(IllegalStateException e) {
			System.out.println("Queue is Full.");
		}
		
		for (Integer integer : queue) {
			System.out.println(integer);
		}
		System.out.println("****************************");
		queue.remove();
		System.out.println("First element of the queue: "+queue.element());
	 */
		
		System.out.println("After Poll: "+  queue.poll());
		System.out.println("After Peek: " + queue.peek());
		
		System.out.println();
		System.out.println("Add Data to the queue: ");
		System.out.println(queue.offer(1));
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		queue.offer(6);
		System.out.println(queue.offer(7));
		
		//display queue
		for (Integer integer : queue) {
			System.out.println(integer);
		}
		System.out.println("************************");
		
		System.out.println("After Poll: "+queue.poll());
		System.out.println("After Peek: " + queue.peek());
		
		for (Integer integer : queue) {
			System.out.println(integer);
		}
	}
}
