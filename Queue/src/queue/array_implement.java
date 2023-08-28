package queue;
import java.util.*;

public class array_implement {
	
	static class queue{
		static int front;
		static int rear;
		static int size;
		static int arr[];
		
		queue(int n){
			front=rear=-1;
			size=n;
			arr=new int[n];
		}
		
		public static boolean isfull() {
			return (rear+1)%size==front;
		}
		
		public static boolean isempty() {
			return rear==-1 && front==-1;
		}
		
		public static void insert(int x) {
			if(isfull()) {
				System.out.println("queue is full");
				return;
			}
			
			if(front==-1) {
				front=0;
			}
			
			rear=(rear+1)%size;
			arr[rear]=x;
		}
		
		public static int remove() {
			if(isempty()) {
				System.out.println("queue is empty");
				return -1;
			}
			
			int res=arr[front];
			
			if(front==rear) {
				front=rear=-1;
			}else {
				front=(front+1)%size;
			}
			return res;
		}
	}
	
	public static void main(String args[]) {
		queue q=new queue(5);
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.insert(5);
		System.out.println("removed elements :");
		System.out.println(q.remove());
		System.out.println(q.remove());
		q.insert(6);
		q.insert(7);
		System.out.println("queue elements: ");
		while(!q.isempty()) {
			System.out.println(q.remove());
		}		
	}
}
