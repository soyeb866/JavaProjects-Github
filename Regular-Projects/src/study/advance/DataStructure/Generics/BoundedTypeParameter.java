package study.advance.DataStructure.Generics;

import java.util.ArrayList;
import java.util.List;

class Data4<K extends Integer,V extends BoundedTypeParameter>{
	private K key;
	private V value;
	
	public Data4(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}


	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Data4 [key=" + key + ", value=" + value + "]";
	}
	
	public <E extends Character,N extends Number> void display(E element, N number) {
		System.out.println("Element: " + element + " Number: " + number);
	}

} 

public class BoundedTypeParameter {
	public static void main(String[] args) {
		Data4<Integer, BoundedTypeParameter> data = new Data4<>(1, new BoundedTypeParameter());
//		System.out.println(data.getKey());
//		System.out.println(data.getValue().test());		
		data.display('%', 2.8f);		
		
		List<Data4<Integer, BoundedTypeParameter>> list = new ArrayList<>();
		list.add(new Data4<Integer, BoundedTypeParameter>(1, new BoundedTypeParameter()));
		list.add(new Data4<Integer, BoundedTypeParameter>(2, new BoundedTypeParameter()));
		list.add(new Data4<Integer, BoundedTypeParameter>(3, new BoundedTypeParameter()));
		list.add(new Data4<Integer, BoundedTypeParameter>(4, new BoundedTypeParameter()));
	
		display1(list);
	}
	
	public String test1() {
		return "Testing 1....";
	}
	
	public String test2() {
		return "Testing 2....";
	}
	
	public String test3() {
		return "Testing 3....";
	}
	
	static public void display1(List<Data4<Integer, BoundedTypeParameter>> data) {
		for(Data4<Integer, BoundedTypeParameter> item: data) {
			System.out.println(item.getKey());
			System.out.println(item.getValue().test1());
			System.out.println(item.getValue().test2());
			System.out.println(item.getValue().test3());
		}
	}
}
