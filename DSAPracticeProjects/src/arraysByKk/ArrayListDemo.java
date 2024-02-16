package arraysByKk;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo {

	public static void main(String[] args) {


		ArrayList<Integer> list = new ArrayList<Integer>(5);

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list.contains(10));
		
		System.out.println(list);

		list.set(0, 900);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
//	Scanner in = new Scanner(System.in);
//	
//	
//	for(int i = 0; i<5; i++) {
//		list.add(in.nextInt());
//	}
//	
//	for(int i = 0; i<5; i++) {
//		System.out.println(list.get(i));//list[index] syntax will not work here
//	}
	
	}

}
