package arraysByKk;

import java.util.Scanner;
import java.util.ArrayList;
public class multiDimAList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		//Initializing
		for(int i = 0; i<3;i++) {
			list.add(new ArrayList<Integer>());
		}

		
		//Declaration
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3;j++) {
				list.get(i).add(in.nextInt());
			}
		}
		System.out.println(list);
	}
	

}
