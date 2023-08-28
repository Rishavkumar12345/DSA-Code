package stack;
import java.util.*;

public class postfix_to_prefix {
	public static void main(String args[]) {
		
		String s="ABC/-AK/L-*";
		Stack<String>st=new Stack<>();
		
		String s1,s2,temp;
		int n=s.length();
		
		for(int i=0;i<n;i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				st.push(s.charAt(i)+"");
			}else {
				char ch=s.charAt(i);
				s1=st.pop();
				s2=st.pop();
				temp=ch+s2+s1;
				st.push(temp);
			}
		}
		String ans = "";
        for (String i : st)
            ans += i;
        
		System.out.println(ans);
	}
}
