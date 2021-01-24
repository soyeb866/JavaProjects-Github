package study.advance.lambdaexpression;

//Create Single Abstract Method Interface
interface Test{
	public void demo();
}

public class Introduction {
	
	public static void main(String[] args) {
		
		//Implement Functional Interface using Regular Process
		/*
		 * Test lambda = new Test() {
		 * 
		 * @Override public void demo() { System.out.println("Statement-1");
		 * System.out.println("Statement-1"); }
		 * 
		 * }; lambda.demo();
		 */
		
		//Implement Interface using Lambda Expression
		/*
		 * Test lambda =()->System.out.println("Statement-1"); lambda.demo();
		 */
		
		/*
		 * Test lambda =()->{ System.out.println("Statement-1");
		 * System.out.println("Statement-2"); }; lambda.demo();
		 */
		
	}

}
