package hashing;
import java.util.*;

public class frequency2 {
	public static void main(String args[]) {
		
		HashMap<Character,Integer>hm=new HashMap<>();
		
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		
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
		
		System.out.println("value "+"freq");
		for(char key:hm.keySet() ) {
			System.out.println(key + "     "+hm.get(key));
		}
	}
}
