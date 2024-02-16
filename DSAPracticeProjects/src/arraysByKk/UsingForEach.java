package arraysByKk;
import java.util.Scanner;
public class UsingForEach {

	public static void main(String[] args) {

//		int[] ara = {1,2,3,4};
//		
//		for(int num : ara) {
//			System.out.print(num+" ");
		//}
		Scanner in = new Scanner(System.in);
		
		
		int[] array = new int[3];
		array[0]= 10;
		array[1]= 20;
		array[2]= 30;
//		
//		for(int numa : array) {
//			System.out.print(numa +" ");
//		}

		System.out.println("Enter Array elements:");
		for (int i = 0; i<array.length;i++) {
			
			array[i] = in.nextInt();
			
		}
		for (int i = 0; i < array.length;i++) {
			System.out.print(array[i]+" ");
		}

	
	}

}
