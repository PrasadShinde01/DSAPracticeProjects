package arraysByKk;
import java.util.Arrays;

public class CharInString {

	public static void main(String[] args) {

		String arr = "aejbf";
		char target = 'j';
		boolean ans = stringChar(arr, target);
		System.out.println(ans);
		/*
		 * if we want to convert String to Array
		 */
		System.out.println(Arrays.toString(arr.toCharArray()));
		

	}
	static boolean stringChar(String arra, char targett) {
		if (arra.length() == 0) {
			return false;
		}
		for (int in = 0; in< arra.length(); in++) {
			char element = arra.charAt(in);
			if(element == targett) {
				return true;
			}
			
		}
		return false;
	}

}
