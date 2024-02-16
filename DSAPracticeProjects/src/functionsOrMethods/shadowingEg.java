package functionsOrMethods;

public class shadowingEg {
	static int x =10;

	public static void main(String[] args) {

		System.out.println(x);
//		
		int x;
		x = 1999;
		System.out.println(x);
		inti();
//	}
//
//	
	}
	static void inti() {
		System.out.println(x);
}
}
