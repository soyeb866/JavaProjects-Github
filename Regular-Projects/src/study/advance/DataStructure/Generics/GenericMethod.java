package study.advance.DataStructure.Generics;

import java.util.ArrayList;
import java.util.List;

class PrintElement {

	public <E> void getPrintList(List<E> list) {
		System.out.println("List of Data: ");
		System.out.println("*******************");
		for (E item : list) {
			System.out.println(item);
		}

	}

	public <E> void getPrintArray(E[] list) {
		System.out.println("Array of Data: ");
		System.out.println("*******************");
		for (E item : list) {
			System.out.println(item);
		}

	}
}

public class GenericMethod {

	public static void main(String[] args) {
		List<Integer> integerData = new ArrayList<>();
		integerData.add(2);
		integerData.add(3);
		integerData.add(4);
		integerData.add(5);
		
		new PrintElement().getPrintList(integerData);
		
		List<String> StringData = new ArrayList<>();
		StringData.add("Soyeb");
		StringData.add("Kanon");
		StringData.add("Nasir");
		StringData.add("Zahir");
		new PrintElement().getPrintList(StringData);
		
		Double[] doubleNumber = {2.3,4.2,3.3};
		new PrintElement().getPrintArray(doubleNumber);

	}

}
