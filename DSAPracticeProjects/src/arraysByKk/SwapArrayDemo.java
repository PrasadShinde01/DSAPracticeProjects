package arraysByKk;

import java.util.Arrays;

public class SwapArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arra = {1,2,3,4,5};
		swap(arra, 1, 3);
		System.out.println(Arrays.toString(arra));
	}
	static void swap(int [] arra, int index1,int index2) {
		int temp = arra[index1];
		arra[index1] = arra[index2];
		arra[index2]= temp;
	}

}
