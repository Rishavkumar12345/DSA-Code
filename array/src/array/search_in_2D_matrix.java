package array;

public class search_in_2D_matrix {
	
	static boolean findAns(int arr[][],int target) {
		
		int row=0;
		int col=arr[0].length-1;
		
		while(row<arr.length && col>=0) {
			
			if(arr[row][col]==target) {
				return true;
			}else if(arr[row][col]<target) {
				row++;
			}else {
				col--;
			}
		}
		return false;
	}
	
	public static void main(String args[]) {
		
		 // Binary search in sorted matrix
        int arr[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 } };
        boolean ans = findAns(arr, 23);
        System.out.println("Element found at index: "+ans);
	}
}
