package heap;
import java.util.*;



public class pratice {
	
	int arr[];
	int size;
	int cap;
	
	pratice(int c){
		arr=new int[c];
		size=0;
		cap=c;
		arr[0]=Integer.MIN_VALUE;
	}
	
	int left(int i) {
		return 2*i+1;
	}
	int right(int i) {
		return 2*i+2;
	}
	int parent(int i) {
		return (i-1)/2;
	}
	
	void swap(int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public void insert(int val) {
		
		if(size>=cap) {
			return;
		}
		arr[++size]=val;
		
		for(int i=size-1;i!=0 && arr[parent(i)]>arr[i];) {
			swap(parent(i),left(i));
			i=parent(i);
		}
	}
	
	public void display() {
		int n=size;
		
		for(int i=0;i<=n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void printf() {
		for(int i=1;i<=size/2;i++) {
			System.out.println("parent "+arr[i]);
			System.out.println("left child "+arr[2*i+1]);
			System.out.println("right child "+arr[2*i+2]);
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		pratice p=new pratice(10);
		
		p.insert(11);
		p.insert(11);
		p.insert(12);
		p.insert(4);
		p.insert(15);
		p.display();
		p.printf();
	}
}
