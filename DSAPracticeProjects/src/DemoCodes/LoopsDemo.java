package DemoCodes;
import java.util.Scanner;

public class LoopsDemo {

	public static void main(String[] args) {
		
		//Scanner in = new Scanner(System.in);
		//int n = in.nextInt();
		
//		for (int num = 1; num <=n; num++) {
//			//System.out.println(num + " ");
//			System.out.print("Hello World" + " ");
//		}

		
		//(2) = while loop
		//while loop Syntax
		 /*
		  * 
		  * while(condition){
		  *  body
		  }
		  
		  */
		//Q. print 1 to 5 numbers using while loop
		
//		int i = 1;
//		while (i <= 5) {
//			System.out.println(i);
//			i +=1;
//		}
		
		
		//(3) = do while loop
		// do while will execute at least once because condition is given after execution
		int n = 1;
		do {
			System.out.println(n);
			n ++;
		}while(n <=5);
	}

}
