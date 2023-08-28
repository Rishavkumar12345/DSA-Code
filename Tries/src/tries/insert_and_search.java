package tries;
import java.util.*;

public class insert_and_search {
	
	static class trienode{
		trienode freq[]=new trienode[26];
		boolean flag;
		
		trienode(){
			flag=false;
			for(int i=0;i<26;i++) {
				freq[i]=null;
			}
		}
	};
	


	static trienode root;
	
	public static void insert(String key) {
		
		trienode temp=root;
		
		int index;
		
		for(int i=0;i<key.length();i++) {
			index=key.charAt(i)-'a';
			
			if(temp.freq[index]==null) {
				temp.freq[index]=new trienode();
			}
			temp=temp.freq[index];
		}
		temp.flag=true;
	}
	
	public static boolean search(String key) {
		
		trienode temp=root;
		int index;
		
		for(int i=0;i<key.length();i++) {
			index=key.charAt(i)-'a';
			
			if(temp.freq[index]==null) {
				return false;
			}
			temp=temp.freq[index];
		}
		return temp.flag;
	}
	
	public static boolean startwith(String key) {
		
		trienode temp=root;
		int index;
		
		for(int i=0;i<key.length();i++) {
			index=key.charAt(i)-'a';
			
			if(temp.freq[index]==null) {
				return false;
			}
			temp=temp.freq[index];
		}
		if(temp.flag==false) {
			return true;
		}
		return false;
	}
	
	public static void main(String arg[]) {
		
		  String keys[] = {"the", "a", "there", "answer", "any",
                  "by", "bye", "their"};
		  
		  String output[] = {"Not present in trie", "Present in trie"};
		  
		  root=new trienode();
		  
		  for(int i=0;i<keys.length;i++) {
			  insert(keys[i]);
		  }
		  
		  
		  if(search("the")) {
			 System.out.println("the" + " ---- " +output[1]);
		  }else {
			 System.out.println("the" + " ---- " +output[0]);  
		  }
		  
		  
		  if(search("those")) {
			  System.out.println("those" + " ---- " +output[1]);
		  }else {
			  System.out.println("those" + " ---- " +output[0]);  
		  }
		  
		  if(startwith("th")) {
			  System.out.println("th" + " ---- " +output[1]+" with prefix th");
		  }else {
			  System.out.println("th" + " ---- " +output[0]+" with prefix th");  
		  }
	}
}
