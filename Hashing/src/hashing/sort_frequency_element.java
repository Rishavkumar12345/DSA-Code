package hashing;
import java.util.*;

public class sort_frequency_element {
	
	class SortComparator implements Comparator<Integer>{
		
		private final Map<Integer, Integer> freqMap;
		  
	    // Assign the specified map
	    SortComparator(Map<Integer, Integer> tFreqMap)
	    {
	        this.freqMap = tFreqMap;
	    }
		
		@Override
		
		public int compare(Integer n1,Integer n2) {
			
			int freqcomp=freqMap.get(n1).compareTo(freqMap.get(n2));
			
			int valuecomp=n1.compareTo(n2);
			
			if(freqcomp==0) {
				return valuecomp;
			}else {
				return freqcomp;
			}
		}
		
	}
	
	public static void main(String args[]) {
		
		int arr[]={ 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 };
		
		Map<Integer,Integer>hm=new HashMap<>();
		ArrayList<Integer>output=new ArrayList<>();
		
		for(int it:arr) {
			if(hm.containsKey(it)) {
				hm.put(it, hm.get(it)+1);
			}else {
				hm.put(it, 1);
				output.add(it);
			}
		}
		
		 SortComparator incom = new SortComparator(hm);
		
		Collections.sort(output,incom);
		
		for(Integer it:output) {
			System.out.print(it + " ");
		}
	}
}
