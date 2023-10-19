package Lambda;

public interface i1 {

//created a No Parameter abstract method in a(interafce)
	public void ab();
	
}
/*
 * Lambda expression is a new and important feature of Java which was included in Java SE 8.
 *  It provides a clear and concise way to represent one method interface using an expression.
 *  It is very useful in collection library. It helps to iterate, filter and extract data from collection.

  The Lambda expression is used to provide the implementation of an interface
   which has functional interface. It saves a lot of code.
 * 
 * Java lambda expression is consisted of three components.

            1) Argument-list: It can be empty or non-empty as well.

            2) Arrow-token: It is used to link arguments-list and body of expression.

            3) Body: It contains expressions and statements for lambda expression.
 * 
 * 
 * To redefine the interface method in a class:
 * No Parameter Syntax:

         interfacename objectname=() -> {  
                //Body of no parameter lambda  
                } 
                 
   One Parameter Syntax:
   

        interfacename objectname=(p1) -> {  
                  //Body of single parameter lambda  
                 };
                 
   Two Parameter Syntax:

        interfacename objectname=(p1,p2) -> {  
             //Body of multiple parameter lambda  
                   }  
 * 
 * To call it, Syntax: objectname.methodname();
 * 
 * 
 * */