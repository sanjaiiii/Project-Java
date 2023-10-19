package assignment;

public class A2 {

	private static A2 obj;

	public static void main(String[] args) {
		
	A2.detail();	
	
	//Find largest of three numbers 
	int a=1;
	int b=2;
	int c=3;
	if(a>b && a>c)
	{System.out.println("A is the Largest Number");}
	else if(b>a && b>c)
	{System.out.println("B is the Largest Number");}
	else
	{System.out.println("C is the Largest Number");}
		
	A2 bo=new A2();
	System.out.println("Area of triangle is "+ bo.a());
	
	//print numbers from 10 to 15 using do while
	int i=10;
	do {
		System.out.println(i);
		i=i+1;
	}
	  while(i<=15);
	
	A2. obj= new A2();
	
	
	
	}

	//print your name, age and address using static method
	public static void detail() {
		System.out.println("Name:Sanjay, Age:25, Address:palldam.tirupur");
	}
	
	//find area of triangle using non static method and return its result
	public int a() {
		int b=45;
		int h=56;
		return  b * h/2;			
	}
	
	//find average of two numbers using constructor 
     public A2() {
    	 
    	 float d1=34.50f;
    	 float d2=36.3f;
    	  System.out.println("Average of 2 num is " +(d1+d2/2));
    	 
    	 
     }
	
	
}
