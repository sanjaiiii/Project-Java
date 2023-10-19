package basics;

public class C1 {

	public static void main(String[] args) {
	//constructor: a special method that is used to initialize objects.
//it takes classname as its name & doesnot contain returntype.
//Whenever an object is created, the constructor is called automatically		
		
	 
		
		///syntax for creation: accesmodifier classname(){}
		//syntax for calling:   classname objectname= new classname();
		C1 ab=new C1();
		C1 ob=new C1(100);
		
		
		
		
	}
     
	public C1 (int b) 
		{int s=45;
		double a=34.56;
		float c=34.56f;
		
		System.out.println(s*a*c+b); }
	
		
	public C1() {
		
		String z="Constructor";
		System.out.println(z);
	}
	
	
	}
	
	
	
	
	

