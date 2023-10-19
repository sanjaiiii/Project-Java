package scanner;

import java.util.Scanner;

public class s1 {
	
	
/*The Scanner is mostly used to receive user input and parse them into..
 *..primitive data types such as int, double or default String
 */

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ur name: ");
		String Name=s.nextLine();
		System.out.println("Enter ur age: ");
		int Age=s.nextInt();
		System.out.println("Enter ur salary: ");
		double Salary=s.nextDouble();
		System.out.println("Are you virgin?");
		boolean Answer=s.nextBoolean();
		
		System.out.println("Name is " + Name );
		System.out.println("Age is " + Age );
	    System.out.println("Salary is " + Salary );
	    System.out.println("Virgin? " + Answer );
	    
	}

	
	
}
