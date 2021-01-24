package study.advance.DataStructure;

import java.util.ArrayList;
import java.util.Stack;

public class StackDataStructure {

	static Stack<String> stack = new Stack<>();

	public static void main(String[] args) {
		System.out.println("************************************");
		System.out.println("** Push Data **");
		System.out.println("************************************");
		// Add Items
		stack.push("Soyeb");
		stack.push("Nasir");
		stack.push("Zahir");
		stack.push("Jesmin");
		
		for (String name : stack) {
			System.out.println(name);
		}

		System.out.println("************************************");
		System.out.println("** Pop Data **");
		System.out.println("************************************");
		stack.pop();
		for (String name : stack) {
			System.out.println(name);
		}
		
		System.out.println("************************************");
		System.out.println("** Peek Data **");
		System.out.println("************************************");
		System.out.println(stack.peek());
		
		System.out.println("************************************");
		System.out.println("** Search Data **");
		System.out.println("************************************");
		System.out.println(stack.search("Nasir"));
		System.out.println(stack.search("nasir")); //if not on Data Set or case sensitive not match
 
	}
}

	

