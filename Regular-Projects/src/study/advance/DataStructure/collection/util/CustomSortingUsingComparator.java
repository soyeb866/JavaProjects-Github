package study.advance.DataStructure.collection.util;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Data<K,V>{
	private int id;
	private String name;
	
	public Data(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", name=" + name + "]";
	}
}

public class CustomSortingUsingComparator {
	public static void main(String[] args) {
		
		Comparator<Data<Integer,String>> COMPARE_KEY = new Comparator<Data<Integer,String>>(){

			@Override
			public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {
				if(o1.getId()<o2.getId()) {
					return -1;
				}
				else if(o1.getId()>o2.getId()) {
					return 1;
				}
				else {
					return 0;
				}
			}
			
		};
		
		Comparator<Data<Integer,String>> COMPARE_NAME = new Comparator<Data<Integer,String>>(){

			@Override
			public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {
				if(o1.getName().length()<o2.getName().length()) {
					return -1;
				}
				else if(o1.getName().length()>o2.getName().length()) {
					return 1;
				}
				else {
					return 0;
				}
			}
			
		};
		
	
		//Note when you do natural comparing, it will be remove repeating element
		
		//Set<Data<Integer, String>> set = new LinkedHashSet<>();
		Set<Data<Integer, String>> set = new TreeSet<>(COMPARE_NAME);
		set.add(new Data<Integer, String>(1,"One"));
		set.add(new Data<Integer, String>(2,"Two"));
		set.add(new Data<Integer, String>(3,"Three"));
		set.add(new Data<Integer, String>(4,"Four"));
		set.add(new Data<Integer, String>(5,"Five"));
		set.add(new Data<Integer, String>(5,"Five"));
		
		for (Data<Integer, String> data : set) {
			System.out.println(data);
		}
		
	}
}
