package study.advance.lambdaexpression;

import java.util.function.IntPredicate;

public class Predicate {

	public static void main(String[] args) {
		/*
		 * IntPredicate lessThan18 = new IntPredicate() {
		 * 
		 * @Override public boolean test(int value) { if(value<18) { return true; } else
		 * { return false; } }
		 * 
		 * };
		 */
		
		IntPredicate lessThan18 = i->i<18;
		IntPredicate moreThan10 = i->i>10;
		//System.out.println(lessThan18.and(moreThan10).test(146));
		//System.out.println(lessThan18.or(moreThan10).test(146));
		new Predicate().demo(12, lessThan18, moreThan10);

	}
	
	public void demo(int x, IntPredicate lessThan18, IntPredicate moreThan10) {
		if(lessThan18.and(moreThan10).test(x)) {
			System.out.println("Correct");
		}
		else {
			System.out.println("invalid");
		}
	}

}
