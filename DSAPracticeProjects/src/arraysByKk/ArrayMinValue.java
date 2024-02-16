package arraysByKk;

public class ArrayMinValue {

	public static void main(String[] args) {


		int [] arr = {12,23,54,56,-2,44,8,3,6};
		System.out.println(min(arr));
	}
	

	static int min(int[] arr) {
		int ans = arr[0];
		for (int i = 1;i<arr.length; i++ ) {
			
			if( arr[i] < ans) {
				ans = arr[i];
				
			}
		}
		return ans;
	}
	
}
