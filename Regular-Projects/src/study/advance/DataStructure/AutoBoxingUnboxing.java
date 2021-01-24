package study.advance.DataStructure;

import java.util.ArrayList;


//class WrapperInt{
//	private int myInteger;
//
//	public WrapperInt(int myInteger) { 
//		this.myInteger = myInteger;
//	}
//
//	public int getMyInteger() {
//		return myInteger;
//	}
//
//	public void setMyInteger(int myInteger) {
//		this.myInteger = myInteger;
//	}
//}

public class AutoBoxingUnboxing {

	
	public static void main(String[] args) {
		//cusome wrapper class
//		ArrayList<WrapperInt> numbers = new ArrayList<>(); //Generic
//		numbers.add(new WrapperInt(28)); //boxing
//		numbers.add(new WrapperInt(21));
//		numbers.add(new WrapperInt(23));
//		numbers.add(new WrapperInt(24));
//		
//		for(WrapperInt number: numbers) {
//			System.out.println(number.getMyInteger()); //unboxing
//		}
		
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(new Integer(28)); //boxing
		numbers.add(21); //AutoBoxing
		numbers.add(new Integer(23));
		numbers.add(new Integer(24));
		
		System.out.println(numbers.get(0).intValue());
		System.out.println("******************************");
		
		for(Integer number: numbers) {
			//System.out.println(number); //unboxing			
			System.out.println(number.intValue()); //unboxing
		}
		
	}
}
