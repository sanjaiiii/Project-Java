package overLoading;

public class S1 {

	public static void main(String[] args) {
		//*overloading
		 //*    using same methodname for different purpose showing difference in
		 //*       number of parameters /datatype/sequence 
		 //*       
		 //*       static
		 //*       nonstatc
		 //*       constructor
//Polymorphism means "many forms", and it occurs when we have many classes..
		//that are related to each other by inheritance
//Polymorphism are 2 types --> overloading and overriding


		//// Static overloading
		
		
		S1.area();
		S1.area(4);
		S1.area(5);
		S1.area(19.89, 20);
		S1.area(25, 34.56);

		
		
		
	}

	public static void area() {
		System.out.println("Area");
	}
	
	public static void area(int s) {
		System.out.println("Area of square is "+s*s);}
	
	public static void area(double r) {
		System.out.println("Area of square is"+(3.14*r*r));	}
	
	public static void area(int s, double b) {
		System.out.println("Area of square is "+s*b);}
	
	public static void area(double a, int c) {
		System.out.println("Area of square is "+0.5*a*c);}
	
	
}
