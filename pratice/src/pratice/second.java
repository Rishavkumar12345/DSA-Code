package pratice;
import java.util.*;

class trinode{
	trinode freq[]=new trinode[26];
	int endwith;
	int prefix;
	boolean flag;
	
	trinode() {
		for(int i=0;i<26;i++) {
			freq[i]=null;
		}
		endwith=0;
		prefix=0;
		flag=false;
	}
}



public class second{
	
	static trinode root;
	
	public static void insert(String key) {
		
		trinode temp=root;
		int index;
		
		for(int i=0;i<key.length();i++) {
			index=key.charAt(i)-'a';
			if(temp.freq[index]==null) {
				temp.freq[index]=new trinode();
			}
			temp=temp.freq[index];
			temp.prefix++;
		}
		temp.endwith++;
		temp.flag=true;
	}
	
	public static boolean isempty(trinode temp) {
		
		for(int i=0;i<26;i++) {
			if(temp.freq[i]!=null) {
				return false;
			}
		}
		return true;
	}
	
	public static trinode remove(trinode temp,String s,int depth) {
		
		if(temp==null) {
			return null;
		}
		
		if(depth==s.length()) {
			
			if(temp.flag==true) {
				temp.flag=false;
			}
			
			if(isempty(temp)) {
				temp=null;
			}
			return temp;
		}
		
		int index=s.charAt(depth)-'a';
		if(temp.freq[index]!=null) {
			temp.freq[index]=remove(temp.freq[index],s,depth+1);
		}
		
		 if (isempty(temp) && temp.flag == false){
	            temp = null;
	        }
	 
	        return temp;
	}
	
	public static int countwordequalto(String key) {
		
		trinode temp=root;
		int index;
		
		for(int i=0;i<key.length();i++) {
			index=key.charAt(i)-'a';
			if(temp.freq[index]==null) {
				return 0;
			}
			temp=temp.freq[index];
		}
		return temp.endwith;
	}
	
	public static int countprefixequalto(String key) {
		
		trinode temp=root;
		int index;
		
		for(int i=0;i<key.length();i++) {
			index=key.charAt(i)-'a';
			if(temp.freq[index]==null) {
				return 0;
			}
			temp=temp.freq[index];
		}
		return temp.prefix;
	}
	
	public static void main(String args[]) {
		
		root=new trinode();
		String keys[]= {"apple","apple","apps","apps","hell","helmet"};
		
		for(int i=0;i<keys.length;i++) {
			insert(keys[i]);
		}
		
		System.out.println("Treis contain apple "+countwordequalto("apple")+" times");
		System.out.println("Treis contain apps "+countwordequalto("apps")+" times");
		System.out.println("Treis contain appl "+countwordequalto("appl")+" times");
		System.out.println("Treis contain app prefix "+countprefixequalto("app")+" times");
		System.out.println("Treis contain hel prefix "+countprefixequalto("hel")+" times");
	}
}
