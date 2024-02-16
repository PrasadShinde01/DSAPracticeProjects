package linearSearchAlgo;

public class Smallest {

	public static void main(String[] args) {
		int [] arr = {14,12,13,8,2};
		int array_size = arr.length;
		System.out.println(smallest(arr,array_size));
	}
	static int smallest(int [] arr,int size_of_array) {
		int result = 0;
		for(int i=0;i<size_of_array;i++) {
			int small = arr[0];
			if(arr[i]<small) {
				result = arr[i];
			}else{
			result = arr[0];
			}
		}
		
		return result;
	}

}
