package overriding;

public class parent {

	public static void main(String[] args) {

//overriding : using same methodname for different purpose..
//..showing difference in location
		
//Methods created in the parent class is=>overridden method=>to call use (parent object)
//Methods created in the Child class is=>overriding method =>to call use (child object)
//Only Non-Static methods should be used
//follows the inheritance 
//
		parent.add(234);
		parent p=new parent();
		p.add();
	
	}

	//creating a overridden method..
	
	public void add() {
		
		int a=100;
		double b=100.137;
		
		System.out.println("(Overridden Non-Static Method)The Addition of 2 num is "+(a+b));
		
	}
	
	public static void add(int f)
	{
		int g=10;
		double h=23.4;
		System.out.println("(Overridden Static Method)"+(g+h+f));
	}
	
}
