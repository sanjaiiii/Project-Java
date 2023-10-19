package CollectionFramework;

import java.util.ArrayList;

public class List {


	public static void main(String[] args) {

/*Any group of individual objects which are..
*represented as a single unit is known as a collection of objects
*(Store large amount of data under a single name)
*
*List is an ordered collection
*index based
*we can add or remove
*iterate
*Accept Duplicates
*retrieve(to view)(Meaning-to get something back)
*
*Have to use the datatype in the syntax as:
*use this:    Instead of:
*Integer      int
*Double       double
*Float        float
*Character    char
*Boolean      boolean
*String       String
*
*
*To Create a list Syntax:
*ArrayList<datatype> Name= new ArrayList<>();
*/
        
		
		
     ArrayList<Integer> l= new ArrayList<>();
	    l.add(0);
	    l.add(11);
	    l.add(22);
	    l.add(33);
	    l.add(44);
	    l.add(55);
	    l.add(11);
	    System.out.println(l);
	  
	    
	    //To check the specific element is there in the list or not
	    System.out.println(l.contains(0));
	    //To find the specific element in the list
	    System.out.println(l.get(4));
	    //To remove the specific element in the list
	    l.remove(4);
	    System.out.println(l);
        //To iterate using for loop
	    //Syntax:for(datatype temporary_variable : name of the collection){}
	    for(Integer x:l) 
	    {
	    	System.out.println(x);
	    }
	
	
	}

}
