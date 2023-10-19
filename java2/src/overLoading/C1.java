package overLoading;

public class C1 {

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

		// constructor overloading
		
		C1 ob=new C1();
		ob=new C1(35);
		ob=new C1(34.56);
		ob=new C1(3,45);
	}

	public C1() {
		
		System.out.println("Constructor");
	}
	
    public C1(int s) {
		
		System.out.println("Area of perimter is "+s*4);
	}
    public C1(double d) {
	
	System.out.println("Perimter of circle is "+ 2*3.14*d);
    }
    public C1(int L, double W) {
    	
    	System.out.println("Perimter of Rectangle is "+ (L+W*2));	
    }
    


}
