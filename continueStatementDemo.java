package Talib;

public class continueStatementDemo {

	public static void main(String[] args) {
		int i = 1;
		while (i<=55) {
			System.out.println(i);
			
			if (i==6) {
				continue;
			}
			i++;
		}
	}

}
