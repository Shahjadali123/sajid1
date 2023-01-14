package Talib;
import java.util.Scanner;
interface client{
	static void  input() {	
		System.out.println("My name is Rebel");
	}
	
	void output();
}

class Developer implements client {
	String name;
	double salary;
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		name = sc.nextLine();
		System.out.println("Enter Your Salary");
		salary = sc.nextDouble();
	}
	@Override
	public void output() {
		System.out.println("Name of the employee is "+name+ " and Salary is " + salary);
		
	}
	
	
}

public class interfaceDemo {

	public static void main(String[] args) {
	  /*  client c = new Developer();
		c.input();
		c.output(); */
		
		Developer d = new Developer();
		d.input();
		d.output();
		 

	}

}
