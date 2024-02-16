package linearSearchAlgo;

public class CharInString {

	public static void main(String[] args) {


		String name = "Omkar";
		char target = 'O';
//		boolean ans = charPresent(name, target);
//		System.out.println(ans);
		if(charPresent(name, target)) {
			System.out.println("Char "+target+" is present");
		}else {
			System.out.println("Char "+target+" not present");	
		}
		
	}

	static boolean charPresent(String str, char targ) {
		if(str.length() ==0 ) {
			return false;
		}
		for(int index = 0; index < str.length(); index++) {
			if(targ == str.charAt(index)) {
				return true;
			}
		}
		return false;
	}
	
}
