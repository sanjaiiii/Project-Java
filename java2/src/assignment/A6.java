package assignment;

import java.util.ArrayList;

public class A6 {

	public static void main(String[] args) {

ArrayList<String>ls=new ArrayList<>();	

		
		ls.add("Sanjay");
		ls.add("Sathish");
		ls.add("saravana");
		ls.add("Mohan");
		ls.add("Dhina");
		
//1. Create a String  list, add elements, remove elements, retrieve element and iterate through it
		
				System.out.println(ls);
			//add elements
				ls.add(4, "Mani");
				System.out.println(ls);
			//remove elements
				ls.remove(1);
				System.out.println(ls);
			//retrieve element
				System.out.println(ls.get(3));
			//iterate through it
				for(String a: ls)
				{System.out.println(a);}
				
				
		
				
		
		
		
		
		
		
		
		

	}

}
