package JulyWithKunalK;
import java.util.Scanner;

public class SwitchStatements {
	public static void  main (String [] args) {

		Scanner in = new Scanner (System.in);
		String fruit = in.next();
		
		
		switch (fruit) {
		
		case "Mango" :
			System.out.println("King of fruits");
		break;
		case "Orange":
			System.out.println("Orange colored fruit");
			break;
		case "Banana":
		System.out.println("Yello  and Sweet");
		break;
		case "Papaya":
			System.out.println("Yello from outside and Orange inside");
				break;
		case "Kiwi":
			System.out.println("Blue inside and Containds small seeds");
			break;
		
			default :
				System.out.println("enter valid fruit name ");
			 
		}
	}

}
