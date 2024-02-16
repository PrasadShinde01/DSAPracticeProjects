package Fundamentals;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter Temp in Celcious :");
		float tempInC = in.nextInt();
		

		float tempInF = (tempInC * 9/5 )+ 32;
		System.out.println("Temp in Fahrenheit is : "+tempInF);
		

	}

}
