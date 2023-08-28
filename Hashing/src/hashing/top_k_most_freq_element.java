package hashing;
import java.util.*;

public class top_k_most_freq_element {
	public static void main(String args[]) {
		
		/*Scanner sc=new Scanner(System.in);
		System.out.print("enter number of elemnent of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.print("/nenter element of array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}*/
		int arr[]= {1,2,2,2,3,5};
		int k=2;
		
		HashMap<Integer,Integer>hm=new HashMap<>();
		
		//System.out.print("/nenter value of k: ");
		//int k=sc.nextInt();
		
		int count=0;
		for(int it:arr) {
			if(hm.containsKey(it)) {
				if(count==k+1) {
					break;
				}else {
					hm.put(it, hm.get(it)+1);
				}				
			}else if(!hm.containsKey(it)){
				if(count==k+1) {
					break;
				}else {
					hm.put(it, 1);
				}
				count++;
			}
			
		}
		
		for (Map.Entry mapElement : hm.entrySet()) {
            int key = (int) mapElement.getKey();
 
            // Adding some bonus marks to all the students
            int value = (int) mapElement.getValue();
 
            // Printing above marks corresponding to
            // students names
            System.out.println(key + " : " + value);
        }
	}
}
