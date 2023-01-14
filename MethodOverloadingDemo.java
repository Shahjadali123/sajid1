package Talib;

public class MethodOverloadingDemo {
	static int add (int x, int y) {
		return x+y;
	}
	
	static double add (double x, double y) {
		return x+y;
	}
		
	

	public static void main(String[] args) {
		
		int a = add(5,9);
		double b = add(5.5,66.8);
		
		System.out.println("Sum of int is " + a);
		System.out.println("Sum of double is " + b);
		

	}

}
