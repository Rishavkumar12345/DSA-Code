package Inheritance;
import java.util.*;

class laptop{
	String name;
	int ram;
	int price;

	laptop(String name, int ram, int price) {
		super();
		this.name = name;
		this.ram = ram;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "laptop [name=" + name + ", ram=" + ram + ", price=" + price + "]";
	}	
	
	
}

public class first_comparator {
	public static void main(String args[]) {
		
		List<laptop>lap=new ArrayList<>();
		lap.add(new laptop("apple",8,12000));
		lap.add(new laptop("acer",16,8000));
		lap.add(new laptop("vitro",4,6000));
		
		Comparator<laptop>com=new Comparator<laptop>() {

			public  int compare(laptop l1,laptop l2) {
				
				if(l1.getPrice()>l2.getPrice()) {
					return 1;
				}else {
					return -1;
				}
			}
			
		};
		
		Collections.sort(lap,com);
		
		for(laptop l:lap) {
			System.out.println(l);
		}
		
	}
}
