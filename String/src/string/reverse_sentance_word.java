package string;
import java.util.*;
import java.util.regex.Pattern;

public class reverse_sentance_word {
	
	public static void reverse(String s) {
		
		int i=0;
		String first="";
		String res="";
		
		while(i<s.length()) {
			
			if(s.charAt(i)==' ') {
				res=first+" "+res;
				first="";
				i++;
			}
			first+=s.charAt(i);
			i++;
		}
		System.out.println(first+" "+res);
	}
	
	public static void main(String arg[]) {
		String st = "Welcome to geeksforgeeks";
		
		Pattern pattern=Pattern.compile(" ");
		
		String s[]=pattern.split(st);
		String res="";
		
		for(int i=s.length-1;i>=0;i--) {			
			res+=s[i]+" ";
		}
		System.out.println(res);
		
		String r="i love geeksforgeeks";
		reverse(r);
	}
}
