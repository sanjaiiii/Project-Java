package exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class e4 {

	public static void main(String[] args) {

		
		/*throw-->used to create our own exception
	     * Syntax: throw new exceptionname ("message")
	     *
	     * To use this u must know the exceptionname
		*/	
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=s.nextInt();
		
		if (age>18)
		{System.out.println("You are Major ra");}
		

		else if(18>age)
		{System.out.println("You are Minor ra");}
		
		
		else
		{throw new InputMismatchException();}
		
		
		
	}

	
	
	
	
	
}
