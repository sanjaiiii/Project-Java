package inheritance;

public class Child extends Parent{

	public static void main(String[] args) {

      Child.cc();
	  Child ob=new Child();
	  ob.ncn();
     //Now to make the inheritance 
	 //use the keyword (extends) like..
	 //..child class definition=> extends parentclassname
	 //Now the child class have the full control of Parent class as well
	 //calling the parent class methods
	  Child.pc();
	  ob.npc();
	 //we can call the parents class methods using child class name and with..
	 //..the object we created in the child class
	  
	  
	}

	public static void cc() {
		System.out.println("Child Class Static Method");
	}
	
	public void ncn() {
		System.out.println("Child Class Non_Static Method");
	}
	
	
	
}
