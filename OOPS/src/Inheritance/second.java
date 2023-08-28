//Hierarchical Inheritance:

package Inheritance;
import java.util.*;

class A{
	public void printa() {
		System.out.println("class A");
	}
}

class B extends A{
	public void printb() {
		System.out.println("class B");
	}
}

class C extends B{
	public void printc() {
		System.out.println("class C");
	}
}

class D extends A{
	public void printd() {
		System.out.println("class D");
	}
}

public class second {
	public static void main(String args[]) {
		D obj_d=new D();
		obj_d.printd();
		obj_d.printa();
		
		C obj_c=new C();
		obj_c.printa();
		obj_c.printb();
		obj_c.printc();
	}
}
