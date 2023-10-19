package basics;

public class Method3 {

	public static void main(String[] args) {
		
		System.out.println("The result is "+ (Method3.multi()));
		System.out.println("The result is "+ (Method3.div()));
		System.out.println("The result is "+ (Method3.addition()));
		System.out.println("The result is "+ (Method3.division()));
	    System.out.println(Method3.multiplication());
        System.out.println(Method3.initial());	
	}
 
	//if we use other return type rather than void, then we have to.. 
//..use the same type &(the return method is must in the other type)
	public static float multi() {
		float a=23.5f;
		float b=34.67f;
		return a*b;
		
	}
	//here we using int as return type, so we are using the..
	//..int all over the method
	private static int div() {
		int c=4;
		int d=8;
		int result=d/c;
		return result;
	//look we must have to use the return method, but we can use..
		//that as we used that in the above method
	}
	
	public static double addition() {
		
		double e=23.45;
		double f=56.98;
		double g=67.79;
		double result=e+f+g;
		
		return 	result;
	}
	
	private static int division() {
		
		int d1=34;
		int d2=46;
		return d2/d1;
				
	}
	
	public static int multiplication() {
		
		int y=34;
		int z=56;
		return y*z;
		
	}
	
	public static char initial() {
		
		char i='k';
		return i;
	}
	
	
	
	
	
	
}
