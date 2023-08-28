package Multithreading;
import java.util.*;

class hello extends Thread{
	
	public  void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("hello");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}

class hii extends Thread{
	
	public  void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("hii");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}

public class first {
	public static void main(String args[]) {
		hello obj1=new hello();
		hii obj2=new hii();
		
		obj1.start();
		try {Thread.sleep(10);} catch(Exception e) {}
		obj2.start();
	}
}
