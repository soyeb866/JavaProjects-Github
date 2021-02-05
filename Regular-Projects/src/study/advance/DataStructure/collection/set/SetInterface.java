package study.advance.DataStructure.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Soyeb");
		set.add("Nasir");
		set.add("Zahir");
		set.add("Kanon");
		set.add("Kanon"); //duplicate value eliminated on hashSet
		set.add("kanon"); //but it is case-sensitive
		
		//System.out.println(set);
		
		for (String item : set) {
			System.out.println(item);
		}
	}
}
