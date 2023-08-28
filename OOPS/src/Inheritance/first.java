package Inheritance;
import java.util.*;

class bicycle{
	int gear;
	int speed;
	
	bicycle(int x,int y){
		this.gear=x;
		this.speed=y;
	}
	
	public String printinfo(){
		return("speed of bicycle is "+speed +"\nno. of gear in bicycle is "+gear);
		
	}
};

class moutainbicycle extends bicycle{
	int height;
	
	moutainbicycle(int a,int b,int c){
		super(a,b);
		this.height=c;
	}
	
	public String display() {
		return(super.printinfo()+ "\nheight of moutain is "+height);
		
	}
}
public class first {
	public static void main(String args[]) {
		moutainbicycle mb=new moutainbicycle(4,120,25);
		System.out.println(mb.display());
	}
}
