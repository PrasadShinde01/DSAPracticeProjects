package functionsOrMethods;
import java.util.Arrays;

public class ChangeValue {

	public static void main(String[] args) {
		int arr [] = {1,2,3,4};
		change(arr);
		System.out.println(Arrays.toString(arr));

	}
	static void change(int [] nums) {
		nums[0] = 99;// if we Make Change object here the Same Object Get Changed, this is The reference variable
		 
	}

	/*
	 * As above we have modified Array likewise if we try to modify the String it will be not get modified
	 * So we can say String Can not be Modified
	 * Aslo we know that Strings are Immutable
	 */
}
