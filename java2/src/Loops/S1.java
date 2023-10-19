package Loops;

public class S1 {

	public static void main(String[] args) {
		/*The switch statement is a multi-way branch statement
		 * It provides an easy way to dispatch execution to different parts of code based on the value of the expression
		 * can't do with double/float/boolean
		 * 
		 * Syntax:
		 * switch(expression)   
		 * {
		 * case:
		 *    statement;
		 *    break;
		 *    
		 * case:
		 *    statement;
		 *    break;
		 *    
		 *default:
		 *     statement;
		 *     break ;
		 *     }
		 *(if u gave a expression that doesn't exist, then default will executed.)         
		 * */
		
		
		int age = 18;
		//We can switch the expression-->age by changing it!
		switch(age)
		
		{
			
			case 2:
			     System.out.println("A baby");
			     break; 
		    case 8:
			      System.out.println("a Child");
			      break;
		    case 18:
		    	System.out.println("Adult");
		    	break;
		    default:
		    	System.out.println("Please enter the valid input");	
		    	
	}
		
		
	}
	
}
		


