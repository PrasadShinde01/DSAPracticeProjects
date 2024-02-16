package linearSearchAlgo;

public class SearchingInArray {

	public static void main(String[] args) {


		String name = "Prasad";
		char ch = 'P';
		System.out.println(search2(name , ch));
				
		
	}
	static boolean search2(String str, char ch) {
		if(str.length() == 0) {
			return false;
		}

		for (char target : str.toCharArray()) {
			if(ch == target) {
			return true;
			
			}
		}
		return false;
	
		
	
	
//	static boolean search(String str, char ch) {
//		if(str.length() == 0) {
//			return false;
//		}
//		for (int i = 0; i< str.length();i++) {
//			if (ch == str.charAt(i)) {
//			return true;}
//		}
//		return false;
	}
	

}
