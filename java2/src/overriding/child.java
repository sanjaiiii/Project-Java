package overriding;

public class child extends parent {

	public static void main(String[] args) {
	
		//calling the child class(overriding method)
		child c=new child();
		c.add(2, 4, 14);
		//calling the parent class(overridden method)
		parent p=new parent();
		p.add();
		
		c.add(345);
	}

	//using the same method name 
	
	public void add(int a,int b,int c) {
		
		System.out.println("(Overriding)The Addition of 3 value is "+(a+b+c));
		
	}
	
	
	
	
}

