package binarySearchKK;

public class orderAgnosticsBS {

	public static void main(String[] args) {

		//int[] arr = {1,2,34,36,46,67,89,90};
		int [] arr = {98,74,34,23,20,2,1};
		int target = 34;
		int ans = orderAgnosticsBS(arr , target);
		System.out.println(ans);


	}
	static int orderAgnosticsBS(int [] arr , int target) {
		int start = 0;
		int end = arr.length - 1;
		
		boolean isAsc = arr[start] < arr[end];
		
		while (start <= end) {
			int mid = start + (end - start) /2 ;
			
			if (target == arr[mid]) {
				return mid;
			}
			
			if(isAsc) {
				if(target > arr[mid] ) {
					start = mid + 1;
				}else {
					end = mid -1;
				}
			}
			else {
				if (target < arr[mid]) {
					start = mid + 1;
				}else {
					end = mid -1;
				}
			}
		}
		return -1;
	}

}
