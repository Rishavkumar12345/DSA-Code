/*A string is called a complete string if every prefix of this string is also 
  present in the array ‘A’. Ninja is challenged to find the longest complete 
  string in the array ‘A’.If there are multiple strings with the same length, 
  return the lexicographically smallest one and if no string exists, return 
  "None".*/

package tries;
import java.util.*;

public class longest_word_with_all_prefix {
	
	static class trnode{
		trnode freq[]=new trnode[26];
		boolean flag;
		
		trnode() {
			flag=false;
			for(int i=0;i<26;i++) {
				freq[i]=null;
			}
		}
	};
	
	static trnode root;
	
	public static void insert(String key) {
		
		trnode temp=root;
		int index;
		for(int i=0;i<key.length();i++) {
			index=key.charAt(i)-'a';
			if(temp.freq[index]==null) {
				temp.freq[index]=new trnode();
			}
			temp=temp.freq[index];
		}
		temp.flag=true;
	}
	
	public static boolean checkforprefix(String key) {
		trnode temp=root;
		int index;
		boolean flag=true;
		
		for(int i=0;i<key.length();i++) {
			index=key.charAt(i)-'a';
			if(temp.freq[index]==null) {
				return false;
			}else {
				temp=temp.freq[index];
				flag=temp.flag;
			}
		}
		return flag;
	}
	
	public static void main(String args[]){
		
		root=new trnode();
		
		String a[]= {"n","nin","ninja","ni","ninj","ninga"};
		
		for(int i=0;i<a.length;i++) {
			insert(a[i]);
		}
		
		String word="";
		for(int i=0;i<a.length;i++) {
			if(checkforprefix(a[i])) {
				
				if(a[i].length()>word.length()){
					word=a[i];
				}else if(a[i].length()==word.length() && word.compareTo(a[i])==0) {
					word=a[i];
				}
			}
		}
		if(word=="") {
			System.out.println("NONE");
		}else {
			System.out.println("longest word with all prefix is "+word);
		}
	}
}
