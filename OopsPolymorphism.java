package com.test;
class Animal{
	void eat() {
		System.out.println("Eating");
	}
	}
	class Dog extends Animal{
		void eat() {
			System.out.println("Eating Milk and Bread");
			
		}
	}


public class OopsPolymorphism {

	public static void main(String[] args) {
		Animal a=new Dog();
		a.eat();
		// TODO Auto-generated method stub

	}

}
