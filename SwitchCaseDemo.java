package Talib;
import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		System.out.println("Enter your age");
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		switch(age){
		  
		case 12 -> System.out.println("You are unexperienced");
		case 18 -> System.out.println("You are beginner");
		case 35 -> System.out.println("You are semi experienced");
		default -> System.out.println("You are experienced");
		
		}
    


	}

}
