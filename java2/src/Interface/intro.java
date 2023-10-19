package Interface;

public interface intro {

	/* 
	 * An interface in Java is a blueprint of a class
	 * 
	 * will have a non-static method with 'default' keyword.
	 * will not have static method
	 * will not have main method
	 * will have abstract method
	 *   abstract method
	 *       non-static 
	 *       no abstract keyword
	 *       will be emtpy in its own place
	 *       will be redefined in the class to which interface connects
	 *       
	 *       class and class will be connected with : extends(Keyword)
	 *       class and interface will be connected with : implements(Keyword)
	 *       Interface-->Note(Create a new interface instead of class)
	 *       
	 *       class definition: implements interface name 
	 * 
	 * */
	
	 default public void nm(String a) 
	{System.out.println(a);}
	
	public void ab();
	
}
