package arraysByKk;

public class ElementIndex {

	public static void main(String[] args) {


		int[] arr = {12,2,3,35,54,66,34};
		int target = 54;
		int ans = arrayIndex(arr , target);
		System.out.println(ans);
	}
	static int arrayIndex(int [] array, int target) {
		if(array.length == 0) {
			return-1;
		}
		
		for (int index =0; index< array.length;index++ ) {
		
			int element = array[index];
			if(element == target) {
				 return index;
			}
		}
		return -1;
	}

}
