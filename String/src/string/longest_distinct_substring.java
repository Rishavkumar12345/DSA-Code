package string;
import java.util.*;

public class longest_distinct_substring {
	
	//time complexity=O(2n)
	/*public static int find(String s,int n) {
		HashSet<Character>hs=new HashSet<>();
		
		int l=0;
		int r=0;
		int len=0;
		int max=0;
		
		while(r<s.length()) {
			char c=s.charAt(r);
			if(hs.contains(c)) {
				max=Math.max(max, len);
				while(l<r && hs.contains(c)) {
					hs.remove(s.charAt(l));
					l++;
				}
			}else {
				len=r-l+1;
			}
			hs.add(c);
			r++;
		}
		
		return max;
	}*/
	
	//time complexity=O(n)
	public static int find(String s,int n) {
		
		HashMap<Character,Integer>hm=new HashMap<>();
		
		int l=0;
		int r=0;
		int len=0;
		int max=0;
		
		while(r<s.length()) {
			
			char c=s.charAt(r);
			if(hm.containsKey(c)) {
				max=Math.max(max,len);
				l=Math.max(hm.get(c)+1, l);
			}
			len=r-l+1;
			hm.put(c, r);
			r++;
		}
		return max;
	}
	
	public static void main(String args[]) {
		
		String s="geeksforgeeks";
		int n=s.length();
		
		int ans=find(s,n);
		System.out.println("the length of longest substring with with distinct character is "+ans);
	}
}
