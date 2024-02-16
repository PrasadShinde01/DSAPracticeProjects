package logicBuildingEGs;

import java.util.Scanner;

public class SortZeroAndOne {
	 public
	    static void arrange012(int[] arr) {  // we arrange 0 1 2 iteratively
	        int i = 0, j = 0, k = arr.length - 1;
	        // 0 to j-1  ==> All Zeroes

	        while (i <= k) {
	            if (arr[i] == 0) {
	                swap(arr, i, j);
	                i++;
	                j++;
	            } else if (arr[i] == 1) {
	                i++;
	            } else {
	                swap(arr, i, k);
	                k--;
	            }
	            }
	        }
	        
	        public
	        static void swap(int[] arr, int i, int j) {
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }

	        // main function
	        public
	        static void main(String[] args) throws Exception {
	            Scanner scn = new Scanner(System.in);
	            
	            int n = 4;
	            int[] arr = new int[]{ 1,0,0,1,2,2,1,0}; 
	        
	            arrange012(arr);
	            for (int i = 0; i < arr.length; i++) {
	                System.out.println(arr[i]);
	            }
	        }

}
