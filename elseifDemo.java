package Talib;
import java.util.Scanner;

public class elseifDemo {

	public static void main(String[] args) {
		System.out.println("Enter your age ");
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age<= 12) {
			System.out.println("You are unexperienced");
			
		}
		
		else if (age>12 && age<=20) {
			System.out.println("You are beginner");
		}
		
		else if (age>20 && age<=35) {
			System.out.println("You are semi experienced");
		}
		
		else {
			System.out.println("You are experienced ");
		}
		

	}

}
