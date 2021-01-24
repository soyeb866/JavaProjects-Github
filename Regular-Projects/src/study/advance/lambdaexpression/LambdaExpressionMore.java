package study.advance.lambdaexpression;

interface demo {
	public double hello(int x, double y);
}

public class LambdaExpressionMore {
	// static int x =20;
	public static void main(String[] args) {
		
		
		
		demo dem=(int x, double y)->
		{ 
		System.out.println("here is the print");
		return x*2 + y; 
		};
		System.out.println(dem.hello(30, 2.0));
		/*
		 * demo dem = new demo() { int x = 22;
		 * 
		 * @Override public void hello() { System.out.println("Hello World! " + x);
		 * 
		 * }
		 * 
		 * }; dem.hello();
		 */
		//System.out.println(x); --> Make Error
		
		//int y =23;
		/*
		 * { int y =23; System.out.println(y); }
		 */
		//int y =23;
		//System.out.println(y);
	}

}
