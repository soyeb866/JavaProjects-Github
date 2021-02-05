package study.advance.DataStructure.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapL1 {

	public static void main(String[] args) {
		Map<Integer,String> student = new HashMap<>();
		student.put(1, "Soyeb");
		student.put(2, "Redwan");
		student.put(3, "Raihan");
		
//		
//		for (Map.Entry<Integer, String> entry: student.entrySet()) {
//			System.out.println("Key: "+entry.getKey() + " Value: "+entry.getValue());
//		}
//		
//		System.out.println(student.get(3));
//		
//		for (Integer key : student.keySet()) {
//			System.out.println("Key: "+key+ " Value: " + student.get(key));
//		}
//		
		Iterator<Entry<Integer,String>> entry = student.entrySet().iterator();
		
		while (entry.hasNext()) {
			Entry<Integer, String> temp = entry.next();
			System.out.println("Key: " + temp.getKey() + " Value: " + temp.getValue());
			
		}
	
	}

}
