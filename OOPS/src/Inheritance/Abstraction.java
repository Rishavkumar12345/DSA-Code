package Inheritance;
import java.util.*;

abstract class shape{
	String color;
	
	abstract double area();
	public abstract void tostring();
	
	shape(String c){
		System.out.println("shape constructor is called");
		color=c;
	}
}

class circle extends shape{
	float radius;
	
	circle(float r,String color){
		super(color);
		System.out.println("circle constructor is called");
		radius=r;
	}
	
	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public void tostring() {
		System.out.println("the area of circle is: "+area());
	}
}

class square extends shape{
	int side;
	
	square(int s,String color){
		super(color);
		System.out.println("square constructor is called");
		side=s;
	}
	
	@Override
	double area() {
		return side*side;
	}
	
	@Override
	public void tostring() {
		System.out.println("the area of square is: "+area());
	}
}

public class Abstraction {
	public static void main(String args[]) {
		circle c=new circle(2.0f,"red");
		square s=new square(5,"yello");
		
		c.tostring();
		s.tostring();
	}
}
