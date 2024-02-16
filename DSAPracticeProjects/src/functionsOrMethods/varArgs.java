package functionsOrMethods;

import java.util.Arrays;

public class varArgs {

	public static void main(String[] args) {
		
		varArg(1,2,3,4);

//		varArg("huff","eeyygf");
		
	}
//	static void varArg(String ...v){
//		System.out.println(Arrays.toString(v));
	//}

	static void varArg(int ...a) {
		System.out.println(Arrays.toString(a));
	}
}
