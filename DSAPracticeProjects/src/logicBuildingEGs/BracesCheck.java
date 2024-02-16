package logicBuildingEGs;

import java.util.Scanner;

public class BracesCheck {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	       System.out.println("Enter String : ");
	       String input = sc.next();
	       int br1=0,br2=0,br3=0;
	       for (int i = 0; i < input.length(); i++) {
	            char x = input.charAt(i);
	            if(x=='{')
	            	br1++;
	            else if(x=='[')
	            	br2++;
	            else if(x=='(')
	            	br3++;
	            else if(x=='}')
	            	br1--;
	            else if(x==']')
	            	br2--;
	            else
	            	br3--;
	 
	       }
	       if(br1==0 && br2==0 && br3==0)
	    	   System.out.println("String Valid");
	       else
	    	   System.out.println("String InValid");

	}
	

}
