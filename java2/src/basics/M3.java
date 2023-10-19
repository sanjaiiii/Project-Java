package basics;

public class M3 {

	public static void main(String[] args) {
		M3.at();
	    M3.id();
		M3.perimeter();
		M3.pr();

	}
	//find area of triangle using static  method(public)
	
	public static void at() {
		int b=50;
		double h=48.56;
		System.out.println("The area of triangles is"+ (1/2*b*h));
	
	}
	//Display your name, age and address using static method(private)
	
	private static void id() {
		System.out.println("Name is sanjay."+ 'T');
		System.out.println("age is"+ 20);
		System.out.println("Address is 3/21 barber street, rayarpalayam, palladam");
		}
	
	//Find the perimeter of square using static method(public)
	
	public static void perimeter() {
		int side=78;
		System.out.println("The perimeter of sqaure is"+ (4*side));

	}
	//Find perimeter of rectangle using static method(private)
	
	private static void pr() 
	{ double l=39.89;
	  float e=87.45f;
	  
	  System.out.println("The perimeter of rectangle is "+2*(l+e));
		
		
		
	}
	
	
	
	
	
	
	
	

}
