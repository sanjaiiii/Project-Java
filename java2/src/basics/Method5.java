package basics;

public class Method5 {

	public static void main(String[] args) {
		
		
		Method5.info("Details---> Name:Sanjay, Age:25, Loc:Tirupur");
		//to call the method a object should be created
		//-->syntax for object creating-> classname objectname = new classname().
        //-->syntax for calling-> object name.methodname()	
		Method5 ob = new Method5();
		System.out.println("The product of three numbers is " + ob.product());
		//object is supposed to created once and we can use it..
		//..whenever and wherever we want.
		ob.addition();
		Method5.subtraction(100,50);
	}
     //(use parameters)
	public static void info(String a) {
		
		System.out.println(a);
	}
//non static method:
	//Syntax= acessmodifier returntype name(){}
	public int product() {
		
		int a=5;
		int b=6;
		int c=7;
		return a*b*c;
		
		
	}
	
	//non static method
	
	public void addition() {
		float num1=100.98f;
		float num2=200.89f;
		
		System.out.println("The addition of 2 number is "+ (num1+num2));
		
	}
//Find subtraction of two numbers using static method(use parameters)
	public static void subtraction(int s1, int s2) {
		
		System.out.println("The subtraction of two numbers is "+ (s1-s2));
		
	}
	
	
	
	
	
}
