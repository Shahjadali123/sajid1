package com.test;
class Rthread1 implements Runnable{
	public void run() {
		int i=1;
		while(i<5) {
			System.out.println("this is a theading");
			System.out.println("this is a theading2");
			i++;
	}
	}
}
class Rthread2 implements Runnable {
	public void run() {
		int j=1;
		while(j<=7) {
			System.out.println("this is a theading3");
			System.out.println("this is a theading4");
			j++;
		}
	}
}

public class Multithreadingdemo2 {

	public static void main(String[] args) {
		
		Rthread1 b1=new Rthread1();
	      Thread g1=new Thread(b1);
	      Rthread2 b2=new Rthread2();
	      Thread g2=new Thread(b2);
	      g1.start();
	      g2.start();
		// TODO Auto-generated method stub

	}

}
