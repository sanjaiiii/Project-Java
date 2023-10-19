package assignment;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {		
		Scanner T = new Scanner (System.in);
		
		System.out.println("User 1 Please enter ur value here : ");		
		int u1=T.nextInt();
		System.out.println("User 2 Please enter ur value here : ");
		double u2=T.nextDouble();
		System.out.println("User 3 Please enter ur value here : ");
		int u3=T.nextInt();
		
		
	
		
		System.out.println("User 1 value is "+ u1);
		System.out.println("User 2 value is "+ u2);
		System.out.println("User 3 value is "+ u3);
		System.out.println("So the average of the 3 users value is "+(u1+u2+u3)/3);
		
	}

}
