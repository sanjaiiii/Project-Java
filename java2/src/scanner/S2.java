package scanner;

import java.util.Scanner;

public class S2 {
	
	public static void main(String[] args) {
		
		Scanner s2= new Scanner(System.in);
		
		System.out.println("Enter your Tamil mark :");
		int TM= s2.nextInt();
		System.out.println("Enter your English mark :");
		int EM= s2.nextInt();
		System.out.println("Enter your Social mark :");
		int SSM= s2.nextInt();
		System.out.println("Enter your Science mark :");
		int SM= s2.nextInt();
		System.out.println("Enter your Maths mark :");
		int MM= s2.nextInt();
		
		
		int Total = TM+EM+SSM+SM+MM; 
		
		System.out.println("Your Total Mark is "+Total );
		
		if(Total>490)
		{System.out.println("Excellent");}
		
		else if (Total>470)
		{System.out.println("Brilliant");}
		
		else if(Total>450)
		{System.out.println("wellDone");}
		
		else if(Total>400)
		{System.out.println("VeryGood");}
		
		else if(Total<300)
		{System.out.println("Poor");}
	
		else if(Total<200)
		{System.out.println("VeryPoor");}
		
		else if(Total<175)
		{System.out.println("Worst ra dei");}
	}

}
