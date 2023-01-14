package Talib;
import java.util.Scanner;

public class passfailDemo {

	public static void main(String[] args) {
		System.out.println("Enter Your Marks");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Physics marks");
		int a = sc.nextInt();
		
		System.out.println("Enter your Chemistry marks");
		int b = sc.nextInt();
		
		System.out.println("Enter your Maths marks");
		int c = sc.nextInt();
		
		System.out.println("Enter your English marks");
		int d = sc.nextInt();
		
		System.out.println("Enter your Computer marks");
		int e = sc.nextInt();
		
		float p =(a+b+c+d+e)/5.0f;
		System.out.println("The Overall percentage is : "+p);
		
		if (p>=40 && a>=33 && b>=33 && c>=33 && d>=33 && e>=33) {
			System.out.println("Congrats! You are passed and your perecentage is : "+p);
		}
		
		else {
			System.out.println("Sorry! You are failed and your percentage is : "+p+ " Please try again!");
		}
		

	}

}
