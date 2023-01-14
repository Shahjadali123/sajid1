package com.test;


//Java interface is used to fully abstraction purpose and also used for multiple inheritance
//It is blueprint of class
//It can have only abstarct methods and variables 
//It cannot have method body
interface printable{
	//public abstract void show();
	void display();
}
class C implements printable{
	public  void display() {
		System.out.println("Display method");
	}
}
public class OopsInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printable obj=new C();
		obj.display();
     //printable.display();
	}

}
