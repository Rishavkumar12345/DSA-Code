package Two_Pointer;
import java.util.*;

public class q3_max_length_subarray {
	public static void main(String args[]) {
		
		String st="abcabdcabca";
		
		HashMap<Character,Integer>hm=new HashMap<>();
		
		int left=0,right=0,length=0;
		
		for( right=0;right<st.length();right++) {
			
			if(hm.containsKey(st.charAt(right))) {
				left=Math.max(hm.get(st.charAt(right))+1,left);
			}
			hm.put(st.charAt(right),right);
			length=Math.max(right-left+1, length);
			
		}
		System.out.print(length);
	}
}
