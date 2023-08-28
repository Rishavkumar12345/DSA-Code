package Recursion;
import java.util.*;

public class Remove_Invalid_Parentheses {
	
	public static void remove(String str,int m,HashSet<String>hs) {
		
		if(m==0) {
			if(getmin(str)==0) {
				hs.add(str);
			}
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			String left=str.substring(0,i);
			String right=str.substring(i+1);
			remove(left+right,m-1,hs);
		}
	}
	
	public static int getmin(String str) {
		
		Stack<Character>st=new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='(') {
				st.push('(');
			}else {
			    if(st.empty()) {
					st.push(')');
				}else if(st.peek()==')') {
					st.push(')');
				}else if(st.peek()=='(') {
					st.pop();
				}
			}
		}
		return st.size();
	}
	
	public static void main(String args[]) {
		
		String str="()())()";
		
		int minp=getmin(str);
		//System.out.println(minp);
		HashSet<String>hs=new HashSet<>();
		
		remove(str,minp,hs);
		
		for(String i:hs) {
			System.out.println(i);
		}
	}
}
