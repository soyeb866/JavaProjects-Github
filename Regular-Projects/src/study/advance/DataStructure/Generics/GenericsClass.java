package study.advance.DataStructure.Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Data<T>{
	//private Object obj;
	private T obj;
	
	public Data() {
		// TODO Auto-generated constructor stub
	}
	public Data(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
	
	

}

public class GenericsClass {

	public static void main(String[] args) {
		
		Data<Object> IntegerData = new Data<Object>(2.6f);		
		System.out.println(IntegerData.getObj());
		
		List<Data<String>> list = new ArrayList<>();
		
		list.add(new Data<String>("Soyeb"));
		list.add(new Data<String>("Nasir"));
		list.add(new Data<String>("Zahir"));
		list.add(new Data<String>("Jesmin"));
		
		Iterator<Data<String>> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getObj());
		}
		
	}
	
	void displayObject(List<Data<String>> list){
		for(Data<String> item : list) {
			System.out.println(item.getObj());
		}
	}

}
