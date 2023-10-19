package abstraction;

public class child extends parent {

	public static void main(String[] args) {
		
      child ob= new child();
      ob.am();
	  parent.nm();	
	}
	

	@Override
	public void am() {
		int a=10;
		int b=15;
		
		System.out.println("Result :"+(a+b));		
		
	}

	
	
}
