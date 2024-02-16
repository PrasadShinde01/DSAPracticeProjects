package JulyWithKunalK;
import java.util.Scanner;


public class EmployeeData {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		String department = in.next();
		int empId = in.nextInt();
		
		switch (empId) {
		case 1 :
			System.out.println("Rahul");
			break;
		case 2 :
		    System.out.println("Shubham");
				break;
		case 3 :
				System.out.println("Employee No. 3 ");
				switch (department) {
				case "It" :
					System.out.println(" IT Department");
				break;
				case "Bank":
					System.out.println("Banking Department");
					break;
					default:
						System.out.println("Enter valid department : ");
					
				}
				
		}
	}

}
