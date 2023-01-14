package start;
import java.util.Scanner;
public interface Client {
	void input();
	void output();

}
class Raju implements Client{
	String name;
	double sal;
	public void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		String name=sc.nextLine();
		System.out.println("enter Salary");
		double sal=sc.nextDouble();
		
		
	}
	public void output() {
		System.out.println(name+" "+sal);
		
	}
	public static void main(String[] args)
	{
		Client c=new Raju();
		c.input();
		c.output();
	}
}
