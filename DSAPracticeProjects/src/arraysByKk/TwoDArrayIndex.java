package arraysByKk;
import java.util.Arrays;
import java.util.Scanner;
public class TwoDArrayIndex {

	public static void main(String[] args) {
		int [][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{12,23,99,34}};
//		int target =23;  //find index of target element
//        int ans[] = index(arr,target);
//        System.out.println(Arrays.toString(ans));
		int ansa = maxIn(arr);
		System.out.println(ansa);
		
	}
	static int[] index(int[][] arr, int target){
	for(int row= 0; row<arr.length;row++) {
		for(int col=0; col<arr[row].length;col++) {
			if(arr[row][col] == target) {
				return new int[] {row,col};
			}
		}
	}
		
	return new int [] {-1,-1};
	}
	static int maxIn(int[][] arr) {
		int maxIn = Integer.MIN_VALUE; // aslo we can write as arr[0][0];
		for(int row = 0; row<arr.length;row++) {
			for(int col = 0; col<arr[row].length;col++) {
				if (arr[row][col] > maxIn) {
					maxIn = arr[row][col];
					
				}
			}
		}
		return maxIn;
	}
	

}
