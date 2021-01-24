package study.advance.DataStructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TypesSet {
	public static void main(String[] args) {
		//Set<String> set = new HashSet<>(); //unorder 
		//Set<String> set = new LinkedHashSet<>(); //order 
		Set<String> set = new TreeSet<>(); //natural-order 
		
		for (int i = 30; i >= 0; i--) {
			set.add("A"+i);
		}
		
		//System.out.println(set);
		
		for (String item : set) {
			System.out.println(item);
		}
	}
}
