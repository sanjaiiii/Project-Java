package exception_Handling;

public class e1 {

	
	//try, catch
	//try, catch, finally
	//try with multiple catch
	//throw
	//throws
	
	
	//try: this block will be used where there is exception occurring possible area
	//catch: this block will be used where exception handling area
	//finally:#This specific block will be applied certainly.. 
	//...if the program has error or no error no matter what.
    //Syntax: 
	/*try {}
	 *
	 *catch(Exception name){}
	 *Note:name-->We can name the exception with a letter or word to store the error
	 *we can also print the error details with the name 
	 * 
	 *finally{}
	*/
	public static void main(String[] args) {
		
		//1.No error, so the catch block is not executed. But the finally block will
		//.. be executed for both
		try
		{
		System.out.println(4/1);	
		}
    
		catch(Exception e) {
			
			System.out.println("Error is "+e);}
		
		finally {
		  	
			System.out.println("Finally block");
		}	
			
		
		
		
		//2.error, so the catch block is executed.But the finally block will
		//.. be executed for both
				try
				{
				System.out.println(4/0);	
				}
		    
				catch(Exception e) {
					
					System.out.println("Error is "+e);	
				}
		        
				finally {
				  	
					System.out.println("Finally block");
				}	
		
		
	}

	
	
}
