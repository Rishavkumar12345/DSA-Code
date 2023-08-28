//print all path that rat will take to reach destination;

package Recursion;
import java.util.*;
import java.util.Scanner;

class Rat_in_maze2{
	
	public static void solve(int arr[][],int n,int i,int j,String ans,ArrayList<String>fin,int vis[][]) {
		
		if(i==n-1 && j==n-1) {
			fin.add(ans);
			return;
		}
		
		//for right move;
		if(j+1<n && vis[i][j+1]==0 && arr[i][j+1]==1) {
			vis[i][j]=1;
			solve(arr,n,i,j+1,ans+'R',fin,vis);
			vis[i][j]=0;
		}
		
		//for left move
		if(j-1>=0 && vis[i][j-1]==0 && arr[i][j-1]==1) {
			vis[i][j]=1;
			solve(arr,n,i,j-1,ans+'L',fin,vis);
			vis[i][j]=0;
		}
		
		//for down move
		if(i+1<n && vis[i+1][j]==0 && arr[i+1][j]==1) {
			vis[i][j]=1;
			solve(arr,n,i+1,j,ans+'D',fin,vis);
			vis[i][j]=0;
		}
		
		//for up move
		if(i-1>=0 && vis[i-1][j]==0 && arr[i-1][j]==1) {
			vis[i][j]=1;
			solve(arr,n,i-1,j,ans+'U',fin,vis);
			vis[i][j]=0;
		}
		
	}
	
	public static ArrayList<String>findpath(int arr[][],int n){
		int vis[][]=new int[n][n];
        for(int[] row:vis) {
        	Arrays.fill(row, 0);
        }
        ArrayList<String>ans=new ArrayList<>();
        if(arr[0][0]==1) {
        	solve(arr,n,0,0,"",ans,vis);
        }
        return ans;
	}
	
    public static void main(String args[]){
        
    	int n = 4;
        int[][] arr = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};

        ArrayList<String>res=findpath(arr,n);

        if(res.size()==0) {
        	System.out.println("-1");
        }else {
        	for(int i=0;i<res.size();i++) {
            	System.out.print(res.get(i)+ " ");
            }
        }
        
         
    }
}
