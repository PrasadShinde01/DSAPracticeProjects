package arraysByKk;
import java.util.Arrays;

public class SwabhawSubString {

	public static void main(String[] args) {

		String str1 = "amaan";
		String str2 = "ama";
		boolean ans = isSubString(str1,str2);
		System.out.println(ans);
		
	}

	static boolean isSubString(String str1 , String str2) {
		int counter = 0;
		
		for(int i = 0; i<str2.length();i++) {
			if(counter == str1.length())
				break;
			if (str1.charAt(counter) == str2.charAt(i)) {
				counter++;
			}
			else {
				if (counter > 0 ) {
					i  = counter;
				}
				counter = 0;
			}
		}
		return counter < str2.length() ? false : true ;
	}
}
