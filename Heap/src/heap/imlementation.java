package heap;
import java.util.*;

class implementation{
	
	public static class MinHeap{
        int arr[];
        int size;
        int capacity;
        
        MinHeap(int c){
	        size = 0; 
	        capacity = c; 
	        arr = new int[c+1];
	        arr[0]=Integer.MIN_VALUE;
        }
	
        int leftchild(int pos) {
        	return 2*pos;
        }
		int parent(int pos) {
			return pos/2;
		}
		int rightchild(int pos) {
			return 2*pos+1;
		}
		
		public void swap(int i,int j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	
		public void insert(int element) {
			// TODO Auto-generated method stub
			
			if(size>=capacity) {
				return;
			}
			
			arr[++size]=element;
			int curr=size;
			
			while(arr[curr]<arr[parent(curr)]) {
				swap(curr,parent(curr));
				curr=parent(curr);
			}
		}
		
		public void display()
	    {
	        for (int i = 1; i <= size / 2; i++) {
	 
	            // Printing the parent and both childrens
	            System.out.print(
	                " PARENT : " + arr[i]
	                + " LEFT CHILD : " + arr[2 * i]
	                + " RIGHT CHILD :" + arr[2 * i + 1]);
	 
	            // By here new line is required
	            System.out.println();
	        }
	    }
		
		public void printf() {
			for(int i=0;i<=size;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
	public static void main(String args[]) {
		MinHeap h=new MinHeap(12);
		
		h.insert(11);
		h.insert(12);
		h.insert(4);
		h.insert(15);
		h.printf();
		h.display();
	}
}




