package graph;
import java.util.*;

class org{
	int i;
	int j;
	int t;
	
	org(int a,int b,int c){
		i=a;
		j=b;
		t=c;
	}
}

public class rotten_orange {
	
	static int row[]= {0,0,-1,1};
	static int col[]= {1,-1,0,0};
	
	public static int caltime(int grid[][]) {
		int n=grid.length;
		int m=grid[0].length;
		
		Queue<org>q=new LinkedList<>();
		int cntfresh=0;
		
		int vis[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				
				if(grid[i][j]==2) {
					vis[i][j]=2;
					q.add(new org(i,j,0));
				}else if(grid[i][j]==0) {
					vis[i][j]=0;
				}
				if(grid[i][j]==1) {
					cntfresh++;
				}
			}
		}
		
		int time=0;
		int cnt=0;
		
		while(!q.isEmpty()) {
			
			org node=q.poll();
			int i=node.i;
			int j=node.j;
			int t=node.t;
			time=Math.max(t,time);
			
			for(int k=0;k<4;k++) {
				int x=i+row[k];
				int y=j+col[k];
				
				if(x>=0 && x<n && y>=0 && y<m && grid[x][y]==1 && vis[x][y]==0) {
					q.add(new org(x,y,t+1));
					vis[x][y]=2;
					cnt++;
				}
			}
			
			
		}
		if(cnt!=cntfresh) {
			return -1;
		}
		return time;
	}
	
	public static void main(String args[]) {
		
		int[][] grid =  {{0,1,2},{0,1,2},{2,1,1}};
		int time=caltime(grid);
		
		System.out.println("time taken to rot all orange is: "+time);
	}
}
