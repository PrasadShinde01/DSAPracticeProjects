package arraysByKk;

import java.util.Arrays;

public class PasssingFunctions {

	public static void main(String[] args) {

		int [] nums = {22,33,44,55};
		System.out.println(Arrays.toString(nums));
		change(nums);
		System.out.println(Arrays.toString(nums));
		pass(nums);
		System.out.println(Arrays.toString(nums));
		/*
		 * we used functions here and changed some values
		 * so we can say that Arrays are Mutable in Java
		 */
	}
	static void change(int [] arr) {
		arr[0] = 10;
	}
	static void pass (int [] araa) {
		araa[1] = 100;
	}

}
