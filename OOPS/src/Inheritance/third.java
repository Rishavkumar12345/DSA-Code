//multiple inheritance using interface

package Inheritance;
import java.util.*;

interface one{
	public void print1();
}

interface two{
	public void print2();
}

interface three extends two,one{
	public void print3();
}

class last implements three{
	
	public void print1() {
		System.out.println("1");
	}
	
	public void print2() {
		System.out.println("2");
	}
	
	public void print3() {
		System.out.println("3");
	}
	
}

public class third {
	public static void main(String args[]) {
		last obj=new last();
		obj.print1();
		obj.print2();
		obj.print3();
	}
}
