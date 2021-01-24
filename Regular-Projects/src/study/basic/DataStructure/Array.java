package study.basic.DataStructure;

public class Array {

	public static void main(String[] args) {
		float[] number = {2.2f, 3.5f, 4.5f};
		
//		for(int i=0; i<number.length; i++) {
//			System.out.println(number[i]);
//		}
		
//		for (float f : number) {
//			System.out.println(f);
//		}
		
		new Array().displayInfo(number);
		
		System.out.println("outside the method" + number[0]);
	}
	
	void displayInfo(float[] c) {
		for (float f : c) {
			System.out.println(f);
		}
		c[0] = 2.4f;
		System.out.println("Inside the method " + c[0]);
	}

}
