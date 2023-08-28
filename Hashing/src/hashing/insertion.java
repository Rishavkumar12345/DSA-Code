package hashing;

public class insertion {
	
	final static int MAX = 1000;
	static boolean hashtable[][]=new boolean[MAX][2];
	
	public static void insert(int arr[],int n) {
		
		for(int i=0;i<n;i++) {
			if(arr[i]>=0) {
				hashtable[arr[i]][0]=true;
			}else {
				int x=Math.abs(arr[i]);
				hashtable[x][1]=true;
			}
		}
	}
	
	public static boolean check(int val) {
		if(val>=0) {
			if(hashtable[val][0]) {
				return true;
			}else {
				return false;
			}
		}else {
			val=Math.abs(val);
			if(hashtable[val][1]) {
				return true;
			}else {
				return false;
			}
		}
	}
	
	public static void main(String args[]) {
		int arr[]= {1,-5,-9,5,10,3,-2};
		int n=arr.length;
		insert(arr,n);
		int find=-2;
		if(check(find)) {
			System.out.print("number is present");
		}else {
			System.out.print("number is not present");
		}
	}
	
}
