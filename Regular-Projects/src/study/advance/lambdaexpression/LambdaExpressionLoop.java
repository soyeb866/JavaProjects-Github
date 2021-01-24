package study.advance.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

class Data2{
	private int number;

	public Data2(int number) {
		this.number = number;
	}

	public int getnumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Data [number=" + number + "]";
	}


	
	
}

public class LambdaExpressionLoop {

	public static void main(String[] args) {

		List<Data2> list = new ArrayList<>();
		list.add(new Data2(10));
		list.add(new Data2(20));
		list.add(new Data2(30));
		list.add(new Data2(40));

		/*
		 * for(int number: list) { System.out.println(number); }
		 */

		// list.forEach(temp->System.out.println(temp));
		list.forEach(temp -> {
			if(temp.getnumber()>20) {
				System.out.println(temp.getnumber());
			}
		});
	}

}
