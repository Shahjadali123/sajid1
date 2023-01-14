package Talib;
class Employee{
	// Public Access 
	//String name;
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
	
	/*public void emp(String name, int id) {
		System.out.println("Employee name is "+ name);
		System.out.println("Employee id is "+ id);
	}
	*/

	
}
public class EncDemo {

	public static void main(String[] args) {
		
    Employee e = new Employee();
    //e.emp("Rebel", 252);
    e.setName("Badshah");
    System.out.println("Employee name is "+e.getName());
    
	}

}
