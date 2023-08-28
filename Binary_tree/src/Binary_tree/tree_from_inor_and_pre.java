package Binary_tree;

public class tree_from_inor_and_pre {
	
	static class node{
		int data;
		node left;
		node right;
		
		node(int x){
			data=x;
			left=right=null;
		}
	};
	
	public static int search(int in[],int s,int e,int val) {
		
		for(int i=s;i<=e;i++) {
			if(in[i]==val) {
				return i;
			}
		}
		return -1;
	}
	
	public static node built_tree(int pre[],int in[],int start,int end) {
		
		int idk=0;
		
		if(start>end) {
			return null;
		}
		
		int curr=pre[idk];
		idk++;
		node troot=new node(curr);
		
		if(start==end) {
			return troot;
		}
		
		int pos=search(in,start,end,curr);
			
		troot.left=built_tree(pre,in,start,pos-1);
		troot.right=built_tree(pre,in,pos+1,end);
			
		return troot;
		
		
	}
	
	public static void preorder(node proot) {
		if(proot==null) {
			return;
		}
		System.out.print(proot.data + " ");
		preorder(proot.left);
		preorder(proot.right);
	}
	
	public static void main(String args[]) {
		
		tree_from_inor_and_pre tree=new tree_from_inor_and_pre();
		int preorder[]={1,2,4,5,3,6,7};
	    int inorder[]={4,2,5,1,6,3,7};
	    
	    node root=tree.built_tree(preorder,inorder,0,6);
	    tree.preorder(root);
		
	}
}
