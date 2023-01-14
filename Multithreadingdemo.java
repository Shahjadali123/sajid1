package com.test;


//WE can use thread in two ways
//1: By using extend  thread class
//2.By implements runnnable thread interface
//We are using multithreading for better CPU Utilization
class thread1 extends Thread{
	public void run() {
		int i=1;
		while(i<5) {
			System.out.println("this is a theading");
			System.out.println("this is a theading2");
			i++;
	}
	}
}
class thread2 extends Thread{
	public void run() {
		int j=1;
		while(j<=7) {
			System.out.println("this is a theading3");
			System.out.println("this is a theading4");
			j++;
		}
	}
}
public class Multithreadingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      thread1 a=new thread1();
      a.start();
      thread2 b=new thread2();
      b.start();
	}

}
