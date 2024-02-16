package functionsOrMethods;

public class funOverloading {

	public static void main(String[] args) {

		fun(100);
		fun("dhc");
		
		
	}
	static void fun (int value) {
		System.out.println(value);
	}
	static void fun (String value) {
		System.out.println(value);
	}

}
