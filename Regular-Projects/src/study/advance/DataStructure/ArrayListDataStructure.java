package study.advance.DataStructure;

import java.util.ArrayList;

public class ArrayListDataStructure {

	static ArrayList<String> list = new ArrayList<>();
	static String item;

	public static void main(String[] args) {
		System.out.println("************************************");
		System.out.println("**Add Data**");
		// Add Items
		ArrayListDataStructure.addArrayList(list, "Zahir");
		ArrayListDataStructure.addArrayList(list, "Nasir");
		ArrayListDataStructure.addArrayList(list, "Jesmin");
		ArrayListDataStructure.addArrayList(list, "Kanon");
		ArrayListDataStructure.addArrayList(list, "Soyeb");

		// Display Name
		ArrayListDataStructure.listDisplay(list);

		System.out.println("************************************");

		// get Data by index
		System.out.println("**Get Data by Position**");
		String name = ArrayListDataStructure.getArrayListByPosition(2);
		System.out.println(name);
		
		System.out.println("************************************");
		// get Data by name
		System.out.println("**Get Data by Name**");
		name = ArrayListDataStructure.getArrayListByObject("Zahir");
		System.out.println(name);

		System.out.println("************************************");
		// remove Data by Object
		System.out.println("**Remove Data by Name**");
		ArrayListDataStructure.removeArrayListByObject("Zahir");
		ArrayListDataStructure.listDisplay(list);

		System.out.println("************************************");
		// remove Data by Index
		System.out.println("**Remove Data by Index**");
		ArrayListDataStructure.removeArrayListByIndex(0);
		ArrayListDataStructure.listDisplay(list);

		System.out.println("************************************");
		// Edit Data by Index
		System.out.println("**Edit Data by Index**");
		ArrayListDataStructure.EditArrayListByIndex(0);
		ArrayListDataStructure.listDisplay(list);
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
