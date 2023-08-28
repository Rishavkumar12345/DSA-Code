package Inheritance;
import java.util.*;

class parent{
	void m1() {
		System.out.println("parent class");
	}
}

class child extends parent{
	void m2() {
		System.out.println("child class");
	}
}

public class easy {
	public static void main(String args[]) {
		
		parent p=new child();
		p.m1();
		p.m2();
	}
}
