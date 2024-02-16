package linearSearchAlgo;

public class CharInStringEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st= "Prasad";
		char c = 'P';
		boolean b =isChar(st,c);
		

		System.out.println(b);
		
	}
	static boolean isChar(String str, char c) {
		str.toUpperCase();
		boolean bl = false;
		if(str.length()==0) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				bl = true;
			}
		}
		return bl;
	}

}
