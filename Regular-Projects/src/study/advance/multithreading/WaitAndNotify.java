package study.advance.multithreading;

public class WaitAndNotify {
	static int totalAmount = 0;

	public void withdraw(int amount) {
		System.out.println("Prepare for update");
		synchronized (this) {
			if (totalAmount <= 0) {
				try {
					System.out.println("Money is less than 0");
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("Money withdraw succesfully!");
		totalAmount = totalAmount - amount;
		System.out.println(totalAmount);

	}

	public void deopiste(int amount) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Deposite money");
		totalAmount = totalAmount + amount;
		System.out.println(totalAmount);
		synchronized (this) {

			notify();
		}

	}

	public static void main(String[] args) {
		WaitAndNotify app = new WaitAndNotify();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				app.withdraw(1000);

			}

		});
		thread1.setName("Thread 1");
		thread1.start();

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				app.deopiste(2000);
			}

		});
		thread2.setName("Thread 2");
		thread2.start();
	}
}
