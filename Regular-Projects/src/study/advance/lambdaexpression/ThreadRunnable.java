package study.advance.lambdaexpression;

public class ThreadRunnable {
	public static void main(String[] args) {
		//Normal Thread Implementation
		/*
		 * Thread thread1 = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { System.out.println("Inside the thread"); }
		 * 
		 * }); thread1.start();
		 */
		//Using Lambda Expression to implement Thread
		/*
		 * Thread thread1 = new Thread(()->System.out.println("Inside the thread"));
		 * thread1.start();
		 */
		
		//new Thread(()->System.out.println("Inside the thread")).start();
		
		/*
		 * new Thread(()->{ System.out.println("Inside the thread - 1");
		 * System.out.println("Inside the thread - 2"); }).start();
		 */
	}
}
