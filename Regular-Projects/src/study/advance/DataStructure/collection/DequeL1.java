package study.advance.DataStructure.collection;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeL1 {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedBlockingDeque<>();
//		deque.offerFirst(1);
//		deque.offerFirst(2);
//		deque.offerFirst(3);
//		deque.offerFirst(4);
		
		
		deque.offerLast(1);
		deque.offerLast(2);
		deque.offerLast(3);
		deque.offerLast(4);
		
		//deque.offerLast(10);
		deque.offerFirst(10);
		
		//System.out.println(deque.peekLast());
		System.out.println(deque.peekFirst());
		
		System.out.println("**********************");
		
		for (Integer element : deque) {
			System.out.println(element);
		}
		
		
		System.out.println("**********************");
		deque.pollFirst();
		deque.pollLast();
		deque.poll();
		for (Integer element : deque) {
			System.out.println(element);
		}
		
		
	}

}
