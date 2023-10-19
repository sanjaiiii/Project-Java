package exception_Handling;

public class e2 {

	public static void main(String[] args) {
		
		//try with multiple catch
        try 
        {
        
        System.out.println(4/0);	
        //String s="dei";
        //System.out.println(s.charAt(4));
        }
		
		
        catch(ArithmeticException a) //if we know what will be the error we can use it
        {
        	System.out.println("Error is: "+a);
        }
        
        
		catch(IndexOutOfBoundsException e) {
			
			System.out.println("Error is "+e);
		}

        catch(Exception e)//if we don't know what will be the error, use this but at last
        {
        	System.out.println("Default exception");
        }
	
	}
	
	

	
	
	
	
}
