package Assignment;
import java.util.*;

class stud1
{
    String Name,city;
    int age;
    public void print_data()
    {
        System.out.println("The Name of stud1 is "+Name);
        System.out.println("The City of stud1 is "+city);
        System.out.println("The Age of stud1 is "+age);
    }
}
class stud2 extends stud1
{
    public void print_data()
    {
        System.out.println("The Name of stud2 is "+Name);
        System.out.println("The City of stud2 is "+city);
        System.out.println("The Age of stud2 is "+age);

    }
}
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        stud1 s1=new stud1();
        stud2 s2=new stud2();

        System.out.println("Enter the Name ");
        s1.Name=sc.next();
        System.out.println("Enter the Age");
        s1.age=sc.nextInt();
        System.out.println("Enter the City Name");
        s1.city=sc.next();

        System.out.println("Enter the Name ");
        s2.Name=sc.next();
        System.out.println("Enter the Age");
        s2.age=sc.nextInt();
        System.out.println("Enter the City Name");
        s2.city=sc.next();

        s1.print_data();
        System.out.println();
        s2.print_data();
    }
}