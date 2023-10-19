package Lambda;

public class L1 {

	public static void main(String[] args) {

		
//We are re-defining the abstract method of interface without creating a connection	
    
	/*No Parameter Syntax:

         interfacename objectname=() -> {  
                //Body of no parameter lambda  
                };
    */	

	//Lambda with no parameter
	String s="Sanjay"; 
	i1 Lambda1=()->{
		
		System.out.println("Hey "+s);
	};
	
	//Calling the interface i1 using its interface instance
	//Syntax: objectname.methodname();
	Lambda1.ab();

	

	
/*One Parameter Syntax:
   
      interfacename objectname=(p1) -> {  
                  //Body of single parameter lambda  
                 };
*/
	
	//Lambda with single parameter
	i2 Lambda2=(side)->{  
        System.out.println("area of square is "+ side*side); 
    };  
  //Calling the interface i2 using its interface instance
  	//Syntax: objectname.methodname();
   Lambda2.singlep(40); 
	
	
	
	
/*      Two Parameter Syntax:

        interfacename objectname=(p1,p2) -> {  
             //Body of multiple parameter lambda  
                   };
*/
	
	//Lambda with double parameter
	i3 Lambda3=(Name,t)->{
	   System.out.println("Details:");
	   System.out.println("Name is : "+ Name);
	   System.out.println("Age is : "+ t);};
	   
	 //Calling the interface i2 using its interface instance
	  	//Syntax: objectname.methodname();
	 Lambda3.details("Sanjay.T", 25); 
	   

	
	
	
	}
	
	
	
}
