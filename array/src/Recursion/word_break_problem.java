package Recursion;
import java.util.*;

public class word_break_problem {
	
	public static void wordBreak(String s,String ans,HashSet<String>hs) {
		
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<s.length();i++) {
			String left=s.substring(0,i+1);
			if(hs.contains(left)) {
				String right=s.substring(i+1);
				wordBreak(right,ans+left+" ",hs);
			}
		}
	}
	
	public static void main(String args[]) {
		
		 String temp[] = {"micro","soft","hi","microsoft","hiring","ring"};
		 
		 HashSet<String>hs=new HashSet<>();
		 
		 for(String it:temp) {
			 hs.add(it);
		 }
		 
		 String s="microsofthiring";
		 wordBreak(s,"",hs);
	}
}
