import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int arr[][] = new int[3][];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		arr[0]= new int[4];
		arr[1]= new int[2];
		arr[2]= new int[3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}

}
