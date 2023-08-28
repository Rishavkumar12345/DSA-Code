package pratice;
import java.util.*;
public class Teacher 
{
    String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    @SuppressWarnings("unchecked")
    Map<Integer, Character>[] lec = new HashMap[5];
    String name, subj;
    
    public Teacher() 
    {
        for (int i = 0; i < 5; i++) {
            lec[i] = new HashMap<Integer, Character>();
        }
    }

    public Teacher(String nam, String sub) 
    {
        name = nam;
        subj = sub;
        for (int i = 0; i < 5; i++) {
            lec[i] = new HashMap<Integer, Character>();
        }
    }

    public void addTeacher() {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("\nEnter Division For Lecture : ");
        for (int j = 0; j < 5; j++) {
            System.out.println("\nTime Table for " + week[j]);
            for (i = 1; i < 5; i++) {
                System.out.print("lec" + i + " : ");
                System.out.print("Enter class ");
                char a = sc.next().charAt(0);
                lec[j].put(i, a);
          }
        }
        sc.close();
    }

    public void displayDay(int i) {
        System.out.println("The schedule for " + week[i] + " is:");
        for (Map.Entry<Integer, Character> entry : lec[i].entrySet()) {
            System.out.println("Lec" + entry.getKey() + " : " + entry.getValue());
        }
    }

    public void display() {
        System.out.println("\nName: " + name);
        System.out.println("Subjects: " + subj);
        for (int i = 0; i < 5; i++) {
            System.out.println("On " + week[i] + ": ");
            for (Map.Entry<Integer, Character> entry : lec[i].entrySet()) {
                System.out.println("Lec" + entry.getKey() + " : " + entry.getValue());
            }
        }
    }
   
}
 class leavemanagementsystem {
    public static void main(String[] args) {
        int n, count = 0, day, free;
        int m;
        String choice;
        Teacher o[]  = new Teacher[5];
        Map<String, Integer> dataset = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);
        String name, subj, name1;
        do {
            System.out.println("\nENTER OPERATION YOU WANT TO PERFORM : ");
            System.out.println("1.Add Teachers data in the database");
            System.out.println("2.Display the data of aLL teachers");
            System.out.println("3.Display data of specific teacher: ");
            System.out.println("4.Take a leave");
            n = scanner.nextInt();
            System.out.println();
            switch (n) {
                case 1: 
                    System.out.print("Enter the name of the teacher: ");
                    name = scanner.next();
                    System.out.print("Enter the subjects: ");
                    subj = scanner.next();
                    dataset.put(name, count);
                    o[count] = new Teacher(name, subj);
                    o[count].addTeacher();
                    count++;
                    break;
                
                case 2: 
                    System.out.println("The data of the teachers is: ");
                    for (int i = 0; i < 5; i++) {
                        System.out.println("------------------------");
                        o[i].display();
                    }
                    System.out.println("------------------------");
                    break;
                
                case 3: 
                    
                    System.out.println("The data of specific teacher: ");
                    System.out.println("Enter the name of the teacher");
                    name1 = scanner.next();
                    if (dataset.containsKey(name1)) {
                        System.out.println("The data of the teacher is: ");
                        m = dataset.get(name1);
                        o[m].display();
                    } else {
                        System.out.println("No data of the given name present in the system,please try again");
                    }
                    break;
                    case 4:
                        int z=-1;
                        System.out.println("Enter the name of the teacher");
                        Scanner sc = new Scanner(System.in);
                        name1 = sc.nextLine();
                        
                        String searchKey = name1;
                        for (String key : dataset.keySet()) {
                        if (key.equals(searchKey)) {
                        System.out.println("Found key: " + key);
                        
                        }
                       
                            z=dataset.get(key);		
                        }
                        
                        /* 
                        else
                        {
                            System.out.println("\nNo data of the given name present in the system,please try again");;
                        }
                        */	
                        if(z!=-1){
                        System.out.println("\nEnter the day on which you want leave : ");
                        System.out.println("\n1.Monday");
                        System.out.println("\n2.Tuesday");
                        System.out.println("\n3.Wednesday");
                        System.out.println("\n4.Thursday");
                        System.out.println("\n5.Friday");
                        day = sc.nextInt();
                        o[z].displayDay(day-1);
                        System.out.println("Which lecture do you want free? :");
                        free = sc.nextInt();
                        for(int i=0;i<=count;i++)
                        {
                            if(o[i].lec[day-1].get(free)=='F')
                            {
                                System.out.println("The lecture will be taken by "+o[i].name);
                            }
                        }
                    
                    }
                    scanner.close();
                    break;
                    default: System.out.println("Wrong input please try again :)");
                    break;
            }
                    
                    System.out.println("Do you want to continue\nIf yes enter 'y' else press any other key: ");
                    Scanner sc = new Scanner(System.in);
                    choice = sc.next();
                    sc.close();
                    }
                    while(choice.equals("y"));
                    return ;	
                    }
                    
                }
