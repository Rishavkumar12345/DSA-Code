package tries;
import java.util.*;

class trie{
	trie freq[]=new trie[26];
	
	trie(){
		for(int i=0;i<26;i++) {
			freq[i]=null;
		}
	}
}

public class count_distinct_subarray {
	
	public static int countsubarray(String s) {
		
		int n=s.length();
		
		trie root=new trie();
		
		int cnt=0;
		
		for(int j=0;j<n;j++) {
			trie node=root;
			for(int i=j;i<n;i++) {
				int x=s.charAt(i)-'a';
				if(node.freq[x]==null) {
					node.freq[x]=new trie();
					cnt++;
				}
				node=node.freq[x];
			}
		}
		
		return cnt+1;
	}
	
	public static void main(String args[]) {
		
		String s="abab";
		//int n=s.length();
		
		int count=countsubarray(s);
		System.out.println(count);
	}
}
