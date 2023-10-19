package assignment;

public class A15 extends A14{

	public static void main(String[] args) {
		
		A15 ob = new A15();
		ob.area();
		
		A14 ab = new A14();
	     ab.area(45);
	}

	public void area() {
		
		float r= 39.578f;
		
		System.out.println("Area of circle is "+ 3.14*r*r);
		
	}
	
	
}
