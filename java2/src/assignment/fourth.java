package assignment;

public class fourth extends third{

	public static void main(String[] args) {
		
		third s=new third();
		s.student();
        fourth c= new fourth();
        c.company();    
	}

	public void company()
	{  
		String address="Gandhipuram,Coimbatore";
	    String name="ABC Private Limited";
		System.out.println("Company Details");
		System.out.println("Name is "+name);	
		System.out.println("Address is "+address);
	}
	
}
