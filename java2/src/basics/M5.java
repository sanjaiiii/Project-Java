//Parameters-->The variables passed to the methods
//Arguments--->The values passed to variables
package basics;

public class M5 {

	public static void main(String[] args) {
		//The arguments should be passed while we calling the method
		M5.add(3,2);
		System.out.println("The ans is "+ M5.multiply(5));

	}

//a parameter is a variable defined by the function that receives a value when it is called	
//We should pass the parameters while creating the method
//It should be declared inside the parentheses()	
	

	public static void add(int a, int b) {
	
		//The arguments should be not be passed here
		System.out.println("The ans is "+ (a+b));
		
	}
	
	public static double multiply(double c) {
		//here as we already know, that we should use the return method
		//..for the different return type rather than void.
		return c*c;
		
		
	}
	
	
	
}
