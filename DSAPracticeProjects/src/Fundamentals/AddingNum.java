package Fundamentals;
import java.util.Scanner;

public class AddingNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number 1 ");
		int num1 = input.nextInt();
		System.out.println("Enter Number 2 ");
		int num2 = input.nextInt();
		
		int sum = num1 + num2 ;
		
		System.out.println("sum = " + sum);

	}

}
