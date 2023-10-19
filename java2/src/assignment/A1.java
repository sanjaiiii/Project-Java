package assignment;

public class A1 {

	public static void main(String[] args) {
		
		
		//1.Print 9th table using for loop
		
		for(int a=9; a<=90; a=a+9)
		{
			System.out.println(a);
		}
		
		//2.print odd numbers from 7 to 17 using while loop
		
		int b=7;
		while(b<=17)
		{System.out.println(b);
		b=b+2;}
		
		//3.print even numbers from 0 to 50 using do while loop
		int c=0;
		do
		{ System.out.println(c); 
		c=c+2;}
		while (c<=50);
		
		A1 ob = new A1();
		ob.average(35, 198.3, 345.8f, 99);
				
		A1.details("Sanjay", 25, "3/21, SNJ Street, Rayarpalayam, Palladam641-664.");
		
		
	}

	//4.//4.Find average of four numbers using nonstatic method and return.. 
	//..its result(with parameter)
	
	public void average(int a,double b,float c,int d) {
		
		System.out.println("Average of 4 num is "+ (a+b+c+d/4));
		
	}
	
	//5.Display your details (name, age, address) using static method..
	//..(use parameter) 

	public static void details(String a, int b, String c) {
		
		System.out.println("Details : Name: a, Age: b, Address: c");
		
		
	}
	
	
	
	
	
}
