package logicBuildingEGs;

public class FibonacciNum {

	public static void main(String[] args) {
		fibo(5);

	}
	static void fibo (int n) {
		int first = 0;
		int second = 1;
		for(int i=0;i<n;i++) {
			System.out.print(first+", ");
			
			int nextNum = first + second;
			first = second;
			second = nextNum;
		}
	}

}
