package study.advance.DataStructure.collection;

import java.util.ArrayList;

public class ArrayListL1 {

	static ArrayList<String> list = new ArrayList<>();
	static String item;

	public static void main(String[] args) {
		System.out.println("************************************");
		System.out.println("**Add Data**");
		// Add Items
		ArrayListL1.addArrayList(list, "Zahir");
		ArrayListL1.addArrayList(list, "Nasir");
		ArrayListL1.addArrayList(list, "Jesmin");
		ArrayListL1.addArrayList(list, "Kanon");
		ArrayListL1.addArrayList(list, "Soyeb");

		// Display Name
		ArrayListL1.listDisplay(list);

		System.out.println("************************************");

		// get Data by index
		System.out.println("**Get Data by Position**");
		String name = ArrayListL1.getArrayListByPosition(2);
		System.out.println(name);
		
		System.out.println("************************************");
		// get Data by name
		System.out.println("**Get Data by Name**");
		name = ArrayListL1.getArrayListByObject("Zahir");
		System.out.println(name);

		System.out.println("************************************");
		// remove Data by Object
		System.out.println("**Remove Data by Name**");
		ArrayListL1.removeArrayListByObject("Zahir");
		ArrayListL1.listDisplay(list);

		System.out.println("************************************");
		// remove Data by Index
		System.out.println("**Remove Data by Index**");
		ArrayListL1.removeArrayListByIndex(0);
		ArrayListL1.listDisplay(list);

		System.out.println("************************************");
		// Edit Data by Index
		System.out.println("**Edit Data by Index**");
		ArrayListL1.EditArrayListByIndex(0);
		ArrayListL1.listDisplay(list);
	}

	private static void EditArrayListByIndex(int index) {	
		list.set(index, "Xahid");
	}

	private static void removeArrayListByIndex(int index) {
		list.remove(index);
	}

	private static void removeArrayListByObject(String string) {
		list.remove(string);
	}

	private static String getArrayListByObject(String name) {
		int index = list.indexOf(name);
		if (index != -1) {
			name = getArrayListByPosition(index);
			return name;
		} else
			return "No Data Found!";
	}

	private static String getArrayListByPosition(int index) {
		return list.get(index);
	}

	private static void addArrayList(ArrayList<String> list, String name) {
		list.add(name);
	}

	private static void listDisplay(ArrayList<String> names) {

		for (String name : names) {
			System.out.println(name);
		}
	}
}
