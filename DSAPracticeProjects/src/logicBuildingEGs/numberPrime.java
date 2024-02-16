package logicBuildingEGs;
import java.util.Scanner;
public class numberPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
		int n = 7,f=1;
		for(int i =2; i < n; i++) {
			if(n%i == 0) {
				f=0;
				break;
			}
			f=1;
		}
		if (f==1) {
			System.out.println("Prime");
		}else {
			System.out.println("Not prime");
		}
	}

}
