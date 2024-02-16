package binarySearchKK;

public class binaryClasseg {

	public static void main(String[] args) {
	int[] arr = {1,2,3,4};	
	int target = 44;
	int ans = findUsingBinary(arr , target);
	System.out.println(ans);
	
	
	}
	static int findUsingBinary(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = start + (end - start) /2;
			if(target < arr[mid]) {
				end = mid - 1;
			}else if(target > arr[mid]) {
				start = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
}
