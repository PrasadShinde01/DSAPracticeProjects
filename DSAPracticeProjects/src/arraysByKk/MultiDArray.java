package arraysByKk;
import java.util.Scanner;
import java.util.Arrays;

public class MultiDArray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int[][] ara = new int[3][3];
		
		for(int row = 0; row<ara.length;row++) {
			for (int col=0; col<ara[row].length;col++) {
				ara[row][col] = in.nextInt();
//				System.out.print(ara[row][col]+" ");
			}
//			System.out.println();
		}
		
//		for(int row = 0; row<ara.length;row++) {
//			System.out.println(Arrays.toString(ara[row]));
//		}
		for(int[] num: ara) {
			System.out.println(Arrays.toString(num));
		}
	}

}
