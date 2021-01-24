package study.advance.multithreading;

class Bracket {
	private Object lock = "lock";
	
	public void generate() {
		synchronized(lock){
			for (int i = 0; i <= 10; i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (i <= 5) {
					System.out.print("[");
				} else {
					System.out.print("]");
				}
			}

			System.out.println();
			}

		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class SynchronizedBlock {
	public static void main(String[] args) {
		Bracket bracket = new Bracket();
		new Thread(new Runnable() {
			@Override
			public void run() {
				long start = System.currentTimeMillis();
				for (int i = 1; i <= 5; i++) {
					bracket.generate();
				}
				long end = System.currentTimeMillis();
				System.out.println("Total Executed Thread 1: " + (end - start));
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				long start = System.currentTimeMillis();
				for (int i = 1; i <= 5; i++) {
					bracket.generate();
				}
				long end = System.currentTimeMillis();
				System.out.println("Total Executed Thread 2: " + (end - start));
			}
		}).start();
	}
}
