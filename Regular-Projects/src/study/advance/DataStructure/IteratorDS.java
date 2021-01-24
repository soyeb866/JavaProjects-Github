package study.advance.DataStructure;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorDS {

	public static void main(String[] args) {
		List<Double> list = new LinkedList<Double>();
		System.out.println("************************************");
		System.out.println("** Add Data on LinkedList**");
		System.out.println("************************************");
		
		list.add(4.5); 
		list.add(3.0);
		list.add(2.0);
		list.add(3.5);		
		displayNumber(list);
		System.out.println("************************************");
		//list.sort(null);
		Collections.sort(list);
		displayNumber(list);
		System.out.println("************************************");
		Collections.reverse(list);
		displayNumber(list);
	}
	
	static void displayNumber(List<Double> list){
		//Iterator<Double> iterator = list.iterator();
		ListIterator<Double> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
