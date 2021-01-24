package study.advance.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock2 {
	public static void main(String[] args) {
		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				boolean lockFlag1 = false;
				boolean lockFlag2 = false;
				boolean doneFlag1 = false;
				boolean doneFlag2 = false;
				while (true) {
//					lock1.lock();
//					System.out.println("I am in thread 1 lock 1");
//					lock2.lock();
//					System.out.println("I am in thread 1 lock 2");
//					lock2.unlock();
//					lock1.unlock();

					try {
						if(!lockFlag1) {
							lockFlag1 = lock1.tryLock();
						}
						if(!lockFlag2) {
						lockFlag2 = lock2.tryLock();
						}
					} finally {
						if (lockFlag1 && !doneFlag1) {
							System.out.println("I am in thread 1 lock 1");
							lock1.unlock();
							doneFlag1 = true;
						}
						if (lockFlag2 && !doneFlag2) {
							System.out.println("I am in thread 1 lock 2");
							lock2.unlock();
							doneFlag2 = true;
						}
						if (lockFlag1 && lockFlag2) {
							break;
						}
					}
				}

			}

		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {

//				lock2.lock();
//				System.out.println("I am in thread 2 lock 1");
//				lock1.lock();
//				System.out.println("I am in thread 2 lock 2");
//				lock1.unlock();
//				lock2.unlock();
				
				boolean lockFlag1 = false;
				boolean lockFlag2 = false;
				boolean doneFlag1 = false;
				boolean doneFlag2 = false;

				while (true) {
					try {
						if(!lockFlag1) {
							lockFlag1 = lock1.tryLock();
						}
						if(!lockFlag2) {
							lockFlag2 = lock2.tryLock();
						}
					}
					finally {
						if (lockFlag1 && !doneFlag1) {
							System.out.println("I am in thread 2 lock 1");
							lock1.unlock();
							doneFlag1 = true;
						}
						if (lockFlag2 && !doneFlag2) {
							System.out.println("I am in thread 2 lock 2");
							lock2.unlock();
							doneFlag2 = true;
						}
						if (lockFlag1 && lockFlag2) {
							break;
						}
					}
				}

			}

		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("I am in main thread");

	}
}
