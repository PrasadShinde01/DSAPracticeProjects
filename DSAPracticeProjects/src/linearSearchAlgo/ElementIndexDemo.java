package linearSearchAlgo;

public class ElementIndexDemo {

	public static void main(String[] args) {
		
		int[] nums = {12,23,4,5,65,67,86,677,45,78,98};
		int target =5 ;
		int ans = linearSearch(nums , target);
		System.out.println(ans);
		

	}
	static int linearSearch(int[] arr , int target) {
		if ( arr.length == 0 ){//in the arr.length length has written as .length 
			return -1;         //because .length is a variable used here 
		}                       //and .lentgh() is a method
		//run a for loop
		for(int index = 0; index< arr.length; index++) {
			int number = arr[index]; //here number is element in array at [index]
			if( target == number) {
				return index;
			}
		}
		return -1;
	}

}
