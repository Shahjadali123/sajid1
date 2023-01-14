package Talib;
class Calculation{
	 public void add(int a, int b) {
		System.out.println("Addtion is:"+ (a+b));
	}
	 public void sub(int a, int b) {
		System.out.println("Subtraction is:"+ (a-b));
	}
	
}
// Inheritance is used here                                                                                                                                                                                                                                                                                                                                                                                                                                               ccccccccc

class Bordmas extends Calculation{
	 public void mul(int a, int b) {
		System.out.println("Multiplication is:"+ (a*b));
	}
	 public void div(int a, int b) {
		System.out.println("Division is:"+ (a/b));
	}
	
}

public class third {

	public static void main(String[] args) {
	//	Calculation cl = new Calculation();
		//Calculation.add(5, 65);
		
		//Calculation.sub(48, 250);
		
		Bordmas bd = new Bordmas();
		bd.mul(25, 5);
		bd.sub(25, 8);
		bd.add(25, 2);
		bd.div(33, 3);
	}
	

}
