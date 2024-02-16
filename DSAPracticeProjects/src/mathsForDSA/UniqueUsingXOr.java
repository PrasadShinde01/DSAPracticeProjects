package mathsForDSA;

public class UniqueUsingXOr {

	public static void main(String[] args) {
		int [] arr = {2,2,1,3,4,1,6,4,3,6,9};
		System.out.println(ans(arr));
	}
	static int ans(int [] arr) {
		int unique = 0;
//		for(int n:arr) {
//			unique ^= n;
//		}
		for(int n=0;n<arr.length;n++) {
			unique = unique^arr[n];
		}
		return unique;
	}

}
