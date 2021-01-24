package study.advance.DataStructure.Generics;

import java.util.ArrayList;
import java.util.List;

class Data2<K,V>{
	private int key;
	private String value;

	public Data2() {
	}

	public Data2(int key, String value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Data2 [key=" + key + ", value=" + value + "]";
	}
	
}

class Data3<E,N>{
	private int elements;
	private String number;

	public Data3() {
	}

	public Data3(int elements, String number) {
		this.elements = elements;
		this.number = number;
	}

	public int getKey() {
		return elements;
	}

	public String getValue() {
		return number;
	}

	@Override
	public String toString() {
		return "Data3 [key=" + elements + ", value=" + number + "]";
	}
	
}

public class GenericDataType {
	
	
	public static void main(String[] args) {
//		List<Data2<Integer, String>> list = new ArrayList<>();
//		Data2<Integer, String> data2 = new Data2<>(1,"Soyeb");
//		
//		list.add(new Data2<Integer, String>(1, "Soyeb"));
//		list.add(new Data2<Integer, String>(2, "Nasir"));
//		list.add(new Data2<Integer, String>(3, "Zahir"));
//		list.add(new Data2<Integer, String>(4, "Kanon"));
		
		
		List<Data3<Integer, String>> list = new ArrayList<>();
		
		list.add(new Data3<Integer, String>(1, "Soyeb"));
		list.add(new Data3<Integer, String>(2, "Nasir"));
		list.add(new Data3<Integer, String>(3, "Zahir"));
		list.add(new Data3<Integer, String>(4, "Kanon"));
		
		new GenericDataType().displayObject(list);
		
		
	}
	
	void displayObject(List<Data3<Integer, String>> list){
		for(Data3<Integer, String> item : list) {
			System.out.println(item.getKey() + " " + item.getValue());
		}
	}
}
