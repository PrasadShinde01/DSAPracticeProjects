package functionsOrMethods;
import java.util.Scanner;
public class StrringEg {

	public static void main(String[] args) {
//		String message = Greet();
//		System.out.println(message);
		
		Scanner in = new Scanner(System.in);
		String naam = in.next();
		String Personalised = MyGreet (naam);
		System.out.println(Personalised);
	}

	static String MyGreet(String name) {
		String message = "Hello " + name;
		return message;
	}
//	static String Greet() {
//		String Greeting = "Hello Methods ";
//		return Greeting;
//	}
}


