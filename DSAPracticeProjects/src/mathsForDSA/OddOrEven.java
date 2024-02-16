package mathsForDSA;

public class OddOrEven {

	public static void main(String[] args) {
       int i = 343;
       System.out.println(isOdd(i));

	}
	static boolean isOdd(int n) {
		return (n&1)==1;
	}

}
