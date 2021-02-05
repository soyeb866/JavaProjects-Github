package study.advance.DataStructure.collection.util;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//class Name implements Comparable<Name>{
//	private String name;
//
//	public Name(String name) {
//		this.name = name;
//	}
//
//	@Override
//	public int compareTo(Name object) {
//		if(this.name.length() == object.name.length()) {
//			return 0;
//			}
//		else if(this.name.length() < object.name.length()) {
//			return -1;
//		}
//		else {
//			return 1;
//		}
//				
//	}
//
//	@Override
//	public String toString() {
//		return name;
//	}
//}
//

public class ComparableInterface {

	public static void main(String[] args) {		
		System.out.println("************************************");
		System.out.println("** Add Data on LinkedList**");
		System.out.println("************************************");
		
//		List<Name> list = new LinkedList<Name>();
//		list.add(new Name("Soyeb")); 
//		list.add(new Name("Ed"));
//		list.add(new Name("Eddi"));
//		list.add(new Name("Sunny"));		
//		
//		displayNumber(list);
		
//		Collections.sort(list);
		
		
//list.get(0).compareTo(list.get(1))
		
		List<Object> list = new LinkedList<Object>();
		list.add(new String("Soyeb"));
		list.add("Zahir");
		list.add(2);
		list.add(2.0);
		list.add(2.0f);
		list.add(true);
		list.add('#');
		

		System.out.println("************************************");
		displayNumber(list);;
		
		
	}
	
	static void displayNumber(List<Object> list){
		ListIterator<Object> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
