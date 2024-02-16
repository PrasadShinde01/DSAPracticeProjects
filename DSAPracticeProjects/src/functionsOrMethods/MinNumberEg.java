package functionsOrMethods;
import java.util.Scanner;

public class MinNumberEg {

	public static void main(String[] args) {
		/*
		 * Example 1:
		 */
//		int a = 10;
//		int b = 20;
//		int c = MinFunction(a,b);
//		System.out.println("Min Number is: "+ c);
//		
//		
//	}
//	static int MinFunction(int n1 , int n2) {
//		int min;
//		if (n1 < n2) {
//			min = n1;
//		}else {
//			min = n2;
//		}
//		return min;
		
		/*
		 * Example 2: get two values from User
		 * 
		 */
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter value 1 :");
		int a = in.nextInt() ;
		System.out.println("Enter value 2 :");
		int b = in.nextInt();
		int c = MinimumValue(a,b);
		System.out.println("Minimum Value is: "+ c);
	}
		
		static int MinimumValue(int num1, int num2 ) {
			int mini;
			if (num1 < num2) {
				mini = num1;
			}else {
				mini = num2;
			}
			return mini;
		}
	}

