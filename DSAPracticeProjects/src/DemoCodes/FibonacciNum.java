package DemoCodes;
import java.util.Scanner;

public class FibonacciNum {
	/*
	 * fibonacci numbers is 
	 *                     :  0 1 1 2 3 5 8 13 21 
	 *Count is like        :    1 2 3 4 5 6 7  8
	 * its like by adding previous two numbers we can get next number
	 */

	public static void main(String[] args) {

		Scanner in =  new Scanner(System.in);
		int n = in.nextInt();
		
		int a = 0;
		int b = 1;
		int count = 2;    //here the count is Started from second element i.e 1
		
		while (count <=n) {
			int temp = b;
			b = a + b;
			a = temp;
			count++;
			
		}
		System.out.println(b);
	}

}
