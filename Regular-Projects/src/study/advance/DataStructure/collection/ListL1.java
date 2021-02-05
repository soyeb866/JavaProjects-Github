package study.advance.DataStructure.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListL1 {
	
	public static void main(String[] args) {
		//LinkedList<Double> linkedList = new LinkedList<Double>();
		List<Double> list = new LinkedList<Double>();
		System.out.println("************************************");
		System.out.println("** Add Data on LinkedList**");
		System.out.println("************************************");
//		linkedList.add(2.5); 
//		linkedList.add(3.0);
//		linkedList.add(5.0);
//		linkedList.add(6.0);
		
		list.add(2.5); 
		list.add(3.0);
		list.add(5.0);
		list.add(6.0);
		System.out.println(list);
		displayNumber(list);
		
		//ArrayList<Double> arrayList = new ArrayList<Double>();
		//List<Double> arraylist = new ArrayList<Double>();
		list = new ArrayList<Double>();
		System.out.println("************************************");
		System.out.println("** Add Data on ArrayList**");
		System.out.println("************************************");
		
//		arrayList.add(2.5); 
//		arrayList.add(3.0);
//		arrayList.add(5.0);
//		arrayList.add(6.0);
		
		list.add(2.5); 
		list.add(3.0);
		list.add(5.0);
		list.add(6.0);
		
		System.out.println(list);
		
		displayNumber(list);
	}
	
	static void displayNumber(List<Double> list){
		for (Double number : list) {
			System.out.println(number);
		}
	}
	
}
