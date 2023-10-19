package encapsulation;

public class e1 {
	

	/*Encapsulation: Data hiding
	 * 
	*Does not follow inheritance
	*
	*do not use main method while assigning the values
	*
	*Must declare the variable as private
	*
	**Must not assign value straightly to the value
	*
	*Access the variable to the setter and getter
	*setter : assign value to the variable
	*Getter : view the value stored
	*
	*setter&getter-->non static, public
	*/
	
	
	//You can assign the value by creating a new class..
	//(Note)__u can create the class wherever u want, even in the other packages		

	
	
	private String password;	
	
	//setter
	public void setter(String a) 
	{
		password=a;
	}
	
	//Getter
	public void getter() 
	{
		System.out.println(password);
	}
	
	
	}
	

