package arraysByKk;

public class TargetIndex {

	public static void main(String[] args) {

		int[] arr = {12,23,34,56,87,8,67};
		int target = 87;
		int ans = elementIndex(arr, target);
		System.out.println(ans);


	}
	static int elementIndex(int[] arr, int target) {
		if(arr.length == 0) {
			return -1;
		}
		for (int index = 0; index< arr.length; index++) {
			int element = arr[index];
			if (element == target) {
				return index;
		}
		}
		/*
		 * if we want print that element if it is present in array
		 */
//		for(int index = 0; index<arr.length; index++) {
//			int element = arr[index];
//			if(element == target) {
//				return element;
	//		}
	//	}
		return -1;
	}
	

	
	
}
