package study.advance.DataStructure;

import java.util.LinkedList;

public class LinkedListDataStructure {
	
	public static void main(String[] args) {
		LinkedList<Double> linkedList = new LinkedList<Double>();
		
		System.out.println("************************************");
		System.out.println("** Add Data **");
		System.out.println("************************************");
		linkedList.add(2.5); 
		linkedList.add(3.0);
		linkedList.add(5.0);
		linkedList.add(6.0);
		
		for (Double number : linkedList) {
			System.out.println(number);
		}

		System.out.println("************************************");
		System.out.println("** Remove Data **");
		System.out.println("************************************");
		linkedList.remove();
		for (Double number : linkedList) {
			System.out.println(number);
		}
		

		System.out.println("************************************");
		System.out.println("** Remove Data **");
		System.out.println("************************************");
		linkedList.remove(1);
		for (Double number : linkedList) {
			System.out.println(number);
		}
		
		System.out.println("************************************");
		System.out.println("** Add on Specific Index on Data **");
		System.out.println("************************************");
		linkedList.add(2, 4.0); 		
		for(Double number : linkedList) {
			System.out.println(number);
		} 
	}
}
