package basics;

public class Method4 {

	public static void main(String[] args) {
		
		Method4.area();
		
		System.out.println("The value of 2 product is "+(Method4.product()));

	}

	// when we use void as our return type we have 2 rules to follow
	//1.We should create the method outside the main method.
	//2.Call the method inside the main method
	//NOTE--> VOID return type doesn't return anything so first we should..
//..use the System.out.println()to print and then we call it to get the output.
	public static void area() {
		
		int l=45;
		double e=55.9;
		
		System.out.println("The area of rec is "+ 2*(l+e));
		
	}
	// when we use other as our return type rather than the void..
	//..we have 4 rules to follow (Returntype=void,int,double,float,char,boolean.)
		//1.We should create the method outside the main method.
		//2.Call the method inside the main method
	    //3.If u choose int as your return type, then u must useit..
//.throughout the method(Note-->u can choose any type like void,int,double,float,char,boolean.)
	    //4.u should callit within the System.out.println()
//so remember the 2nd rule, we have to call it inside the main method, here we are..
//..not using the void-(return type) method, so we must return it with the return keyword and then call it inside the main method like this..
//.. System.out.println(classname.methodname());	
	
	private static int product() {
		
		int product1=100;
		int product2=200;
		int result=product1+product2;
		return result;
	// u can use the result like this also
		//int product1=100;
		//int product2=200;
		//return product1+product2 
		
	
	}
	
	
}
