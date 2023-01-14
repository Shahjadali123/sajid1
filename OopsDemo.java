package com.test;
class Addition{
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/*public void Employee(String name,int id) {
		System.out.println("name is"+name);
		System.out.println("id is"+id);
		
	}*/
}
//Partially Abstraction
abstract class Test{
	public abstract void show();
	public static void display() {
		System.out.println("Display method");
	}
		
}
public class OopsDemo {

	public static void main(String[] args) {
		Addition a=new Addition();
		a.setName("Badshah");
		System.out.println("name is"+a.getName());
		// TODO Auto-generated method stub
        Test.display();
	}

}
