package builtinclasses;

public class B2 {

	public static void main(String[] args) {
		
		/*
		 *StringBuffer is mutable & non static in nature, so we have to create a object
		 */
		

		StringBuffer a=new StringBuffer("weLCome");
		
		System.out.println(a.length());
		System.out.println(a.indexOf("m"));
		System.out.println(a.charAt(5));
		
		
		//to add
       System.out.println(a.append("eee"));
       System.out.println(a.insert(5, 'g'));
		
		//delete
       System.out.println(a.deleteCharAt(1));
       System.out.println(a.delete(3, 6));//3,4,5
	
       System.out.println(a.reverse());
       System.out.println(a.reverse());
       
       System.out.println(a.replace(0, 5, "a,b,c,d,e,f"));
       

       StringBuffer b=new StringBuffer("Dei mental uh");
       System.out.println(b.charAt(6));//The space is also counted as a index;
       
	}
	

}
