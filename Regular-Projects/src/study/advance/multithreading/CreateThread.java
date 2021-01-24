package study.advance.multithreading;


class MYCounter extends Thread{
	private int countMe;

	public MYCounter(int countMe) {
		this.countMe = countMe;
	}
	
	@Override
	public void run() {
		try {
			countMe();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void countMe() throws InterruptedException {
		for(int i=0; i<=9; i++) {
			sleep(500);
			System.out.println(i + ": " + countMe);
		}
	}
	
}

public class CreateThread {
	
	public static void main(String[] args) throws InterruptedException {
		MYCounter counter1 = new MYCounter(2);
		MYCounter counter2 = new MYCounter(3);
		
		long startTime = System.currentTimeMillis(); 
		counter1.run();
		System.out.println("********************************");
		counter2.run();
		long endTime = System.currentTimeMillis(); 
		System.out.println("Total Time Process: " + (endTime-startTime));
	}
}
