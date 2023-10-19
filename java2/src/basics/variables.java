package basics;

public class variables {

	public static void main(String[] args) {
		
		String name="Sanjay";
		char initial='T';
		int  age=25;
		double height=6.123456789101112131415;
		float digits=1.123456f;
		boolean result=true;
		
		System.out.println("Name is " + name);
		System.out.println("initial is " + initial);
		System.out.println("age is" + age);
		System.out.println("Double will have upto 15 decimal digits " + height);
		System.out.println("Float will have upto 7 decimal digits" + digits);
		System.out.println("result is" + result);
				
		
		int a=10;
		int b=10;		
		
		System.out.println("addition of a&b is " + (a+b));
		System.out.println("subtraction of a&b is " + (a-b));		
		System.out.println("multiplication of a&b is " + (a*b));
		System.out.println("division of a&b is " + (a/b));
		System.out.println("addition of a&b is " + (a+b));
		
		float c=10.28f;
		double d=20.24;
		
		System.out.println("average of c&d is " + (c+d)/2);
		
		int side=5;
		System.out.println("area of square is " + (side*side));
		System.out.println("perimeter of sqaure is " + 4*side);
		
		// perimeter of rectangle : 2*(l+e)

		char l=20;
		char e=30;
		System.out.println("area of rectangle is " + 2*(l+e));
		
		
		// perimeter of circle: 2*3.14*r
		
		char r=21;
		System.out.println("perimter of circlrea or re is " + 2*3.14*r);
		
		// area of rhombus : d1*d2
		int d1=20;
		int d2=30;
		System.out.println("area of rhombus is " + d1*d2);
		
		// area of triangle: 0.5*b*h
		float h=23.45f;
		System.out.println("area of triangle is " + 0.5*b*h);
		
		// perimeter : b+h
		System.out.println("area of triangle is " + b+h);		

		// Body mass index (weight/height*height)
		System.out.println("body mass index is " + digits/height*height);
		
		//Find area of semicircle( 2* radius* 3.14)
		int radius=30;
		System.out.println("area of semicircle " + 2* radius* 3.14);
		
		//Find area of parallelogram(0.5*d1*d2)
		System.out.println("area of parallelogram " + 0.5*d1*d2);
		
		

	
		
		}
	

}
