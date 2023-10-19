package overLoading;

public class NS1 {

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


		//// Non Static overloading
		
		NS1 ob = new NS1();
		ob.area();
		ob.area(4);
		ob.area(5);
		ob.area(19.89, 20);
		ob.area(25, 34.56);
     
	

	}

	public void area() {
		System.out.println("Area");
	}
	
	public void area(int s) {
		System.out.println("Area of square is "+s*s);}
	
	public void area(double r) {
		System.out.println("Area of square is"+(3.14*r*r));	}
	
	public void area(int s, double b) {
		System.out.println("Area of square is "+s*b);}
	
	public void area(double a, int c) {
		System.out.println("Area of square is "+0.5*a*c);}
	
	
	
}
