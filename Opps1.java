package Talib;
class Abcd{
	String name;
	int id;
	int salary;
	String address;
	
	public void printDetails() {
		System.out.println("Name is " +name+ " employee id is " +id+ " salary is " +salary+ " and Address is " +address);
	}
	
	 
	}

public class Opps1 {

	public static void main(String[] args) {
		Abcd e = new Abcd();
        e.address = "Dhanbad";
        e.name = "Rebel";
        e.id = 22;
        e.salary = 285465;
        
        e.printDetails();
        
        Abcd f = new Abcd();
        f.name = "Divin";
        f.id = 12;
        f.salary = 121211;
        f.address = "Bokaro";
        
        f.printDetails();
        	
	}

}
