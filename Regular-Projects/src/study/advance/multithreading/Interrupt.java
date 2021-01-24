package study.advance.multithreading;

public class Interrupt {
	static int balacnce = 5000;

	public void withdraw(int amount) {
		System.out.println("Prepare for update");
		synchronized (this) {
			if (balacnce <= 0 || 0 >= balacnce - amount) {
				try {
					System.out.println("Money is less than 0");
					wait();
				} catch (InterruptedException e) {
					System.out.println("Interrupted Happened!");

					System.out.println("Money withdraw succesfully!");
					balacnce = balacnce - amount;
					System.out.println(balacnce);

					return;
				}
			} else {
				System.out.println("Else part here!");
			}
		}

		/*
		 * System.out.println("Money withdraw succesfully!"); balacnce = balacnce -
		 * amount; System.out.println(balacnce);
		 */

	}

	public void deopiste(int amount) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Deposite money");
		balacnce = balacnce + amount;
		System.out.println(balacnce);

	}

	public static void main(String[] args) {
		Interrupt app = new Interrupt();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				app.withdraw(5000);

			}

		});
		thread1.setName("Thread 1");
		thread1.start();

		/*
		 * if (totalAmount <= 0) { try { Thread.sleep(5000); } catch
		 * (InterruptedException e) { e.printStackTrace(); }
		 */
		// thread1.interrupt();
		// }

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				app.deopiste(2000);
				thread1.interrupt();
			}

		});
		thread2.setName("Thread 2");
		thread2.start();

	}
}
