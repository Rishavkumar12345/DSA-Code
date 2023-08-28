// countWordsEqualTo() | countWordsStartingWith() 

package tries;
import java.util.*;

public class count {

	static class trinode{
		trinode freq[]=new trinode[26];
		int cntendwith;
		int cntprefixwith;
		
		trinode() {
			cntendwith=0;
			cntprefixwith=0;
			for(int i=0;i<26;i++) {
				freq[i]=null;
			}
		}
	}
	
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
			temp.cntprefixwith++;
		}
		temp.cntendwith++;
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
		return temp.cntendwith;
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
		return temp.cntprefixwith;
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
