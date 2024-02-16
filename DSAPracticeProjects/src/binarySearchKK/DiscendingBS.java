package binarySearchKK;

public class DiscendingBS {

	public static void main(String[] args) {
		int [] arr = {8,6,5,4,2,1};
		int target = 1;
		int ans = descendingBS(arr , target);
		System.out.println(ans);
		

	}
	static int descendingBS(int [] arr , int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= arr.length) {
			int mid = start + (end - start) / 2;
			
			if (target > arr[mid] ) {
				end = mid - 1;
			}else if (target < arr[mid]) {
				start = mid + 1;
			}else {
				return mid;
			}
			
		}
		return -1;
	}

}
