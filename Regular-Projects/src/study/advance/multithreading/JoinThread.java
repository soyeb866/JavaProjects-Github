package study.advance.multithreading;

public class JoinThread {
	int count = 0;

	public static void main(String[] args) {
		JoinThread app = new JoinThread();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				/*
				 * try { Thread.sleep(3000); } catch (InterruptedException e) { // TODO
				 * Auto-generated catch block e.printStackTrace(); }
				 */

				for (int i = 0; i < 1000; i++) {
					app.count++;
				}

			}

		});
		/*
		 * try { thread1.join(); } catch (InterruptedException e) { e.printStackTrace();
		 * }
		 */

		/*
		 * try { Thread.sleep(500); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		/*
		 * try { thread1.join(); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					//thread1.join(2000);
					thread1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i = 0; i < 1000; i++) {
					app.count++;
				}

			}

		});

		thread1.start();
		thread2.start();

		/*
		 * try { thread1.join(); } catch (InterruptedException e) { e.printStackTrace();
		 * }
		 */
		
		try {
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		/*
		 * try { thread2.join(); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		System.out.println(app.count);
	}

}
