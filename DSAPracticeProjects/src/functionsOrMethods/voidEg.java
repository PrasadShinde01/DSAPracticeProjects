package functionsOrMethods;
import java.util.Scanner;
public class voidEg {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double rankPoint = in.nextDouble();
		double rank = rankPoints(rankPoint);
	}
	static double rankPoints(double Points) {
		if (Points >= 22.30) {
			System.out.println("Rank is A1");
		}else if(Points >= 25.50) {
			System.out.println("Rank is A1+");
		}else {
			System.out.println("Rank cant Determined");
		}
		return Points;
	}

}
