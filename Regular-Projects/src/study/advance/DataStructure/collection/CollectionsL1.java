package study.advance.DataStructure.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

class Name implements Comparable<Name>{
	private String name;
	
	
	public Name(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Name o) {
		return getName().compareTo(o.getName());
	}
	
}

public class CollectionsL1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Soyeb");
		set.add("Nasir");
		set.add("Zahir");
		set.add("Kanon");
		set.add("Kanon"); // duplicate value eliminated on hashSet
		set.add("kanon"); // but it is case-sensitive

		// System.out.println(set);

		//Queue<Integer> queue = new LinkedBlockingQueue<>();
		Queue<Integer> queue = new ArrayBlockingQueue<>(6);

		try {
			queue.add(10);
			queue.add(2);
			queue.add(3);
			queue.add(4);
			queue.add(5);
			queue.add(6);
			queue.add(7);
		}
		catch(Exception e) {
			System.out.println("No Element Found!");
		}

		Set<Name> setObj = new HashSet<>();
		setObj.add(new Name("Soyeb"));
		setObj.add(new Name("Nasir"));
		setObj.add(new Name("Zahir"));
		setObj.add(new Name("Farhad"));
		setObj.add(new Name("Kanon")); // duplicate value eliminated on hashSet
		setObj.add(new Name("Israt")); // but it is case-sensitive
		
		
		List<Name> list = new ArrayList<>();
		list.addAll(setObj);

		Collections.sort(list);
		
		//System.out.println(list);

		
		for (Name item : list) {
			System.out.println(item.getName());
		}
		
		System.out.println(Collections.binarySearch(list, new Name("Soyeb")));
	}
}
