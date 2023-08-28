package hashing;
import java.util.*;

public class heightest_freq_char {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string: ");
		String st=sc.next();
		
		HashMap<Character,Integer>hm=new HashMap<>();
		
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(hm.containsKey(ch)) {
				int of=hm.get(ch);
				int nf=of+1;
				hm.put(ch, nf);
			}else {
				hm.put(ch, 1);
			}
		}
		
		System.out.println("height frequency character is ");
		char ch=st.charAt(0);
		int i=0;
		for(char key:hm.keySet()) {
			if(hm.get(key)>hm.get(ch)) {
				ch=key;
				i=hm.get(key);
			}
		}
		System.out.print(ch + " "+ i);
	}
}
