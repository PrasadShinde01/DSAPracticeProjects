package functionsOrMethods;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		
	//	sum(); //for line 30 to 39
		
		int ans = sum();                              //for line19 to 27
		System.out.println(" Answer is : "+ ans); 
//		int ans = sum3(2,3);                         // for line 15 to 17
//		System.out.println("answer is : " + ans);  
	}

//	static int sum3(int a,int b) {
//		int sum =  a +  b ;
//		return sum;
//	}
	static int sum() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first int : ");
		int num1 = in.nextInt();
		System.out.print("Enter Second Int : ");
		int num2 = in.nextInt();
		int sum = num1 + num2;
		return sum;
		
		
	}
//	static void sum() {
//	Scanner in = new Scanner(System.in);
//	System.out.print("Enter first int : ");
//	int num1 = in.nextInt();
//	System.out.print("Enter Second Int : ");
//	int num2 = in.nextInt();
//	int sum = num1 + num2;
//	System.out.println("The sum is " + sum);
//	}
}
