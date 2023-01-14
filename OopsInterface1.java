package com.test;

interface A{
	void show();
}
/*class B implements A{
	public void show() {
		System.out.println("This is a show");
	}
}
*/

public class OopsInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      A obj=()->System.out.println("This is a show");
      obj.show();
      
	}

}
