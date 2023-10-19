package Ifelse;

public class i2 {

	public static void main(String[] args) {
		//if u have more conditions we can go with if, else if, else statements
				//Syntax-->
				//Expression
				//if(condition) {}
		        //else if(condition){}
                //else if(condition){}
	            //else(condition){}

		int a=400;
		int b=900;
		int c=300;
		
		if(a>c && a>b)
		{
			System.out.println("A is Greater than B&C");
		}
		
		else if(b>c && b>a)
		{
			System.out.println("B is Greater than A&C");
		}
		
		else if(c>b && c>a)
		{
			System.out.println("C is Greater than A&B");
		}
		
		else
		{
			System.out.println("poii polappa paara");
		}
		
		
		
		
	}

	
	
}
