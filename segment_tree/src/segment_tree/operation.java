package segment_tree;

public class operation {
	
	int st[];
	
	operation(int arr[],int n){
		
		int x=(int) Math.ceil(Math.log(n)/Math.log(2));
		int max_size=(int) (2*Math.pow(2, x)-1);
		
		st=new int[max_size];
		
		constructutil(arr,0,n-1,0);
	}
	
	int getmid(int s,int e) {
		return s+(e-s)/2;
	}
	
	void updatevalueutil(int ss,int se,int i,int diff,int si) {
		
		if(i<ss || i>se) {
			return;
		}
		
		st[i]=st[i]+diff;
		
		if(se!=ss) {
			int mid=getmid(ss,se);
			updatevalueutil(ss,mid,i,diff,2*si+1);
			updatevalueutil(mid+1,se,i,diff,2*si+2);
		}
	}
	
	void updatevalue(int arr[],int n,int i,int new_val) {
		
		if(i<0 || i>n-1) {
			System.out.println("invalid input");
			return;
		}
		
		int diff=new_val-arr[i];
		arr[i]=new_val;
		updatevalueutil(0,n-1,i,diff,0);
	}
	
	int getsumutil(int ss,int se,int qs,int qe,int si) {
		
		if(qs<=ss && qe>=se) {
			return st[si];
		}
		
		if(qs>se || qe<ss) {
			return 0;
		}
		
		int mid=getmid(ss,se);
		return getsumutil(ss,mid,qs,qe,2*si+1)+getsumutil(mid+1,se,qs,qe,2*si+2);
	}
	
	int getsum(int n,int qs,int qe) {
		
		if(qs<0 || qe>n-1 || qs>qe) {
			System.out.println("invalid input");
			return -1;
		}
		
		return getsumutil(0,n-1,qs,qe,0);
	}
	
	int constructutil(int arr[],int ss,int se,int si) {
		
		if(ss==se) {
			st[si]=arr[ss];
			return arr[ss];
		}
		
		int mid=getmid(ss,se);
		st[si]=constructutil(arr,ss,mid,2*si+1)+constructutil(arr,mid+1,se,2*si+2);
		return st[si];
	}
	
	
	public static void main(String args[]) {
		int arr[] = {1, 3, 5, 7, 9, 11}; 
        int n = arr.length; 
        
        operation tree=new operation(arr,n);
        
        System.out.println("sum of value in given range is "+tree.getsum(n,1,3));
        
        tree.updatevalue(arr, n, 1, 10);
        System.out.println("updated sum of value in given range is "+tree.getsum(n, 1, 3));
	}
}
