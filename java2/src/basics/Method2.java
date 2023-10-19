package basics;

public class Method2 {

	public static void main(String[] args) {
		
		// so here we calling the methods that we created outside the main method
		
		// syntax---> classname.methodname();
		
		Method2.addition();
		Method2.divison();
		
		}
    //method should be created out of the main method, but inside the class method

	// Ensure that u are calling the method inside the main method.
	
	//syntax---> access_modifier static return_type name(){}
	
	public static void addition() {
		
		float a=22.3f;
		double b=34.4;
		int c=3;
		
		System.out.println("The addition of a&B is"+ (a+b+c));
		
		}
	
	//whenever we use private access modifier, we can't call it on other classes
	// if we call it in other classes it will throw error.
	private static void divison() {
		
		int d1=100;
		float d2=2.3f;
		
		System.out.println("The divison of d1&d2 is"+ (d1/d2));
		
		
		
	}
	

	
	
	
	
}
