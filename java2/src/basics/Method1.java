package basics;

public class Method1 {
	
/*Methods: A method is a block of code which only runs when it is called
 * 
 *Methods are used to perform a certain actions and it is also called functions.
 * 	
 *Why use methods? To reuse code: define the code once, and use it many times. 
 */
	

	public static void main(String[] args) {
		
		// so here we calling the methods that we created outside the main method
		
		// syntax---> classname.methodname();
		Method1.add();
		Method1.rectangle();
		Method1.sub();
		
	}
    
	//method should be created out of the main method, but inside the class method

		// Ensure that u are calling the method inside the main method.
		
		//syntax---> access_modifier static return_type name(){}
	public static void add() {
		
		int a=10;
		int b=20;
		
		System.out.println("the result is"+(a+b));
		
	}
	
	public static void rectangle() {
		int l=3;
		int b1=4;
		
		
		System.out.println("the result is"+(l+b1));
		}	
	
	
	//whenever we use private access modifier, we can't call it on other classes
		// if we call it in other classes it will throw error.	
	private static void sub() {
		
		double c=15.00;
		double d=10.00;
		
	System.out.println("the result is"+(c-d));
		}
	
	
	
}
