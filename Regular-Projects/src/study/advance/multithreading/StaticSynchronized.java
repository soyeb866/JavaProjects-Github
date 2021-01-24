package study.advance.multithreading;

class Bracket2 {
	//private String threadName;

	//public Bracket2(String threadName) {
	//	this.threadName = threadName;
	//}

	synchronized static public void generate(String threadName) {
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

		System.out.println("Thread Name " + threadName);

	}

}

public class StaticSynchronized {
	public static void main(String[] args) {
		//Bracket2 bracket1 = new Bracket2("1");
		//Bracket2 bracket2 = new Bracket2("1");
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					Bracket2.generate("1");				}
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					Bracket2.generate("2");
				}
			}
		}).start();
	}
}
