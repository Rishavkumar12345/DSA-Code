package stack;
import java.util.*;

public class prefixt_to_infix {
	public static void main(String args[]) {
		
		String s="/-ab+-cde";
		
		Stack<String>st=new Stack<>();
		
		int n=s.length();
		
		for(int i=n-1;i>=0;i--) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				st.push(s.charAt(i)+"");
			}else {
				char ch=s.charAt(i);
				String s1,s2,temp;
				switch(ch) {
				case '+': s1=st.pop();
						  s2=st.pop();
						  temp="("+s1+"+"+s2+")";
						  st.push(temp);
						  break;
				
				case '-': s1=st.pop();
						  s2=st.pop();
						  temp="("+s1+"-"+s2+")";
						  st.push(temp);
						  break;
				  
				case '*': s1=st.pop();
						  s2=st.pop();
						  temp="("+s1+"*"+s2+")";
						  st.push(temp);
						  break;
					
				case '/': s1=st.pop();
						  s2=st.pop();
						  temp="("+s1+"/"+s2+")";
						  st.push(temp);
						  break;
				}
			}
		}
		
		System.out.println(st.peek());
	}
}
