package stack;
import java.util.*;

import javax.xml.stream.events.Characters;

public class balance_paranthesis {
	
	public boolean check(String s) {
		
		boolean valid=true;
		Stack<Character>st=new Stack<>();
		int n=s.length();
		
		for(int i=0;i<n;i++) {
			
			if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='(') {
				st.push(s.charAt(i));
			}else if(s.charAt(i)==')') {
				
			}
		}
		
		return valid;
	}
	
	public static void main(String arg[]) {
		
		balance_paranthesis ll=new balance_paranthesis();
		ll.check("{[()]}");
	}
}
