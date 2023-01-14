package com.test;



class Addit{
	public static void add(int a,int b) {
		System.out.println("Addition is :"+(a+b));
	}
}
class Multiplication extends Addit{
	public void mul(int a,int b) {
		System.out.println("Multiplication  is :"+(a*b));
	}
}
public class OopsDemo2 {

	public static void main(String[] args) {
		//Addit a=new Addit();
		Addit.add(45, 98);
		Multiplication m=new Multiplication();
		Addit.add(45, 98);
		m.mul(54,32);
		// TODO Auto-generated method stub

	}

}
