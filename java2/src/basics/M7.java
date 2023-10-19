//---->Non static method
package basics;

public class M7 {

	public static void main(String[] args) {
	//to call the method a object should be created
    //-->syntax- classname objectname = new classname()
           //object name.methodname()
		M7 ob = new M7();
		ob.addition();
		//object is supposed to created once and we can use it..
		//..whenever we want.
		ob.average();
		ob.perimter();		
		ob.division();
	}
	//Non static method
	//Syntax= acessmodifier returntype name(){}
	public void addition() {
		
		int a=4;
		double b=5;
		System.out.println("The addition is "+ (a+b));
		
	}
	
	private void average() {
		
		float n1=34.5f;
		float n2=45.78f;
		System.out.println("The average is "+ (n1+n2/2));
		
	}
	
	public void perimter() {
		int l=3;
		int b=4;
		
		System.out.println("The perimeter of rectangle is "+ 2*(l+b));}
		
	private void division() {
		
		int d1 =10;
		int d2=2;
		
		System.out.println("The result of division is "+ (d1/d2));
		
	}	
		
				
		
		
	}
	
