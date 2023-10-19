package test;

import java.util.ArrayList;

abstract public class t1 {

	public static void main(String[] args) {
		//Print odd numbers from 5 to 55 using for loop
        for(int a=5;a<=55;a=a+5)
        {System.out.println(a);}
        
      //Find largest of three numbers
 	   int a=100; 
 	   int b=200;
 	   int c=300;
 	   
 	   if (a>b && a>c)
 	   {System.out.println("A is the Largest");}
 	   
 	   else if(b>c && b>a)
 	   {System.out.println("B is the Largest");}
 	   
 	   else if(c>b && c>a)
 	   {System.out.println("C is the Largest");}

 	
//Create a character list, add elements, remove elements and iterate through it
       
 	  ArrayList<Character> L=new ArrayList<>();
 	  L.add('K');
 	  L.add('M');
 	  L.add('N');
 	  L.add('O');
 	  L.add('P');
 	  System.out.println(L); 
 	  //remove
 	  L.remove(0);
 	  System.out.println(L);
 	  //iterate
 	 for(Character i:L) {System.out.println(i);}  
 	
 	//S=“HelloHOWareYou”. Print “Hello”. Convert S to lower case. Replace ‘o’ by ‘v’
     
     String S="HelloHOWareYou";
     System.out.println("Hello");
     System.out.println(S.toLowerCase());
 	System.out.println(S.replace('o', 'v')); 
 	
 	
 	t1.display("Sanjay", 1234);
 	t1.display();
 	t1.display("Medusind");
 	
 	
	}
	

	//Find addition of two number using abstract method
	   abstract public void ab();
	
//Overload main method and display student details(name, id), employee details (name and company name)

	   public static void display(String name, int id ) 
	   {   System.out.println("Student Details");
		   System.out.println("Name :" +name);
		   System.out.println("Id :" +id);
	   }
	    
	   
	   public static void display() 
	   {
		   System.out.println("Employee Details:");
		   System.out.println("Employee name: John");
	   }
	   public static void display(String comp) 
	   {
		   System.out.println("Company name: " + comp);
	   }
   
}


