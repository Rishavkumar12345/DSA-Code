package constructor;

class test{
	int i;
	test(){
		System.out.println("hello");
		super();
	}
}

public class first {
	public static void main(String args[]) {
		test t=new test();
	}
}
