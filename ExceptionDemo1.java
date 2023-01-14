package Talib;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		 
			   try{  
			      //code that may raise exception  
			      int data=100/0;  
			   }catch(ArithmeticException b){System.out.println(b);}  
			   //rest code of the program   
			   System.out.println("rest of the code...");  
			  }  
			

	}


