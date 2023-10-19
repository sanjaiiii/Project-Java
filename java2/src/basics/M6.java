package basics;

public class M6 {

	public static void main(String[] args) {
		
		//Find subtraction of two numbers and return its result
		int a=100;
		float b=50f;
		float sub=(a-b);
		System.out.println("The subtarction of two number is "+ sub);
		
			
		//Find product of three numbers and return its result 
		int p1=100;
		int p2=200;
		int p3=300;
		System.out.println("The product of three numbers is "+(p1*p2*p3));
		
		
		System.out.println("The are of triangle is "+ M6.A_t());
		
		M6.id();
		
		

	}

	//Find area of triangle using static method and return its result
	
	private static double A_t() {
		
		double b=50.65;
		double h=48.56;
		 return(1/2*b*h);
	}
	//Display your details, name, age, and address using static method(use void)
			private static void id() {
				System.out.println("Name is sanjay."+ 'T');
				System.out.println("age is"+ 20);
				System.out.println("Address is 3/21 barber street, rayarpalayam, palladam");
				}
			
	}
	
	
	
	
	

