package Talib;
import java.util.Scanner;

public class ConditionalDemo {

	public static void main(String[] args) {
     
    System.out.println("Enter Your Age");
    
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    
    if (age>=18) {
    	System.out.println("You can drive");
    }
    
    else {
    	System.out.println("You can not drive");
    }

	}

}
