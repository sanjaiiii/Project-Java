package test;

import java.util.Scanner;

public class t2 extends t1{

	public static void main(String[] args) {
    
		t2 ob= new t2();
		ob.ab();

		//Use assignment operator and print 4 th table using while loop
	 	 int y=4;
	 	 while(y<=80)
	 	 {System.out.println(y);
	 	   y=y+4;
	 	 }
	 	 
		//Get a number from the user and check whether it is odd or even
	 	 
	 	 Scanner number= new Scanner(System.in);
		 System.out.println("Enter the number here:"); 
		 int u1=number.nextInt();
         if(u1%2==0) {System.out.println("The number you entered is even");}
         else {System.out.println("The number you entered is odd");}
         

	}

	@Override
	public void ab() {
		int a=100;
		int b=200;
		System.out.println("The addition of 2 num is "+ (a+b));
		
	}

}
