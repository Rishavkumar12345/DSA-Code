package Assignment;
import java.util.*;

class vehicle{
	
	int reg_no;
	String color;
	String type;
	
	vehicle(int x,String y,String z){
		reg_no=x;
		color=y;
		type=z;
	}
	
	void display() {
		System.out.println("vehicle registration no is: "+reg_no);
		System.out.println("vehicle color is: "+color);
		System.out.println("vehicle type is: "+type);
	}
}

class truck extends vehicle{
	
	int tyre_no;
	
	truck(int a,String b,String c,int d){
		super(a,b,c);
		tyre_no=d;
	}
	
	void display() {
		System.out.println("Truck ");
		super.display();
		System.out.println("truck tyre no is: "+tyre_no);
	}
}

class bike extends vehicle{
	
	int tyre_no;
	
	bike(int a,String b,String c,int d){
		super(a,b,c);
		tyre_no=d;
	}
	
	void display() {
		System.out.println("Bike ");
		super.display();
		System.out.println("Bike tyre no is: "+tyre_no);
	}
}

public class Assignment1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter regination no. of truck");
		int a=sc.nextInt();
		System.out.println("Enter color of truck");
		String b=sc.next();
		System.out.println("Enter type of truck");
		String c=sc.next();
		System.out.println("Enter tyre no. of truck");
		int d=sc.nextInt();
		
		truck it=new truck(a,b,c,d);
		
		
		System.out.println("Enter regination no. of Bike");
		int e=sc.nextInt();
		System.out.println("Enter color of Bike");
		String f=sc.next();
		System.out.println("Enter type of Bike");
		String g=sc.next();
		System.out.println("Enter tyre no. of Bike");
		int h=sc.nextInt();
		
		bike t=new bike(e,f,g,h);
		
		it.display();
		t.display();
	}
}
