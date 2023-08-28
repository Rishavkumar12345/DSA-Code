package array;

public class matrix2 {
	public static void main(String args[]) {
		int arr[][]= { {1,2,3},
					   {4,5,6},
					   {7,8,9}};
		
		int temp;
		for(int i=0;i<3;i++) {
				temp=arr[i][0];
				arr[i][0]=arr[i][2];
				arr[i][2]=temp;
			}
		
		for(int i=0;i<3;i++) {
			for(int j=i+1;j<3;j++) {
				int pre=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=pre;
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
		
	}
}
