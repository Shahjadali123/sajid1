package Talib;
import java.util.Scanner;

public class methodOverloadingDemo2 {
		static int calculation  (int x, int y) {
		return x*y ;
	}
		static double calculation (double h, double j) {
			return h+j;
		}
	 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first value of X");
		int x = sc.nextInt();
		
		System.out.println("Enter the first value of Y");
		int y = sc.nextInt();
		
		System.out.println("The Result will be shoown below: ");
		System.out.println(calculation(x,y));
		
		System.out.println("Enter the first value of H");
		double h = sc.nextDouble();
		
		System.out.println("Enter the first value of J");
		double j = sc.nextDouble();
		
		System.out.println("The Result will be shoown below: ");
		System.out.println(calculation(h,j));
		
		

	}

}
