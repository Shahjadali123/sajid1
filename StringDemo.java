package Talib;

public class StringDemo {

	public static void main(String[] args) {
	  String word = "This is my First string program";
	  System.out.println(word.length());
	// int value =  word.length();
    // System.out.println(value);
     
     String Lword = word.toLowerCase();
     System.out.println(Lword);
     
     String Uword = word.toUpperCase();
     System.out.println(Uword);
     
     String name = "   Rebel   ";
     System.out.println(name);
     String Tname = name.trim();
     System.out.println(Tname);
     
     System.out.println(word.replace('s','m'));
     
     System.out.println(word.startsWith("Thi"));
     
     System.out.println(word.endsWith("am"));
     
     System.out.println(word.charAt(11));

     
	}

}
