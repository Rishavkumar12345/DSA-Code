package constructor;

//Java Code to show use of
//super keyword with constructor

//superclass Person
class Person {
	Person()
	{
		System.out.println("Person class Constructor");
	}
}

//subclass Student extending the Person class
class Student extends Person {
	Student()
	{
		// invoke or call parent class constructor
		super();

		System.out.println("Student class Constructor");
	}
}

class staff extends Student {
	staff()
	{
		// invoke or call parent class constructor
		super();

		System.out.println("staff class Constructor");
	}
}

//Driver Program
public class second {
	public static void main(String[] args)
	{
		staff s = new staff();
	}
}

