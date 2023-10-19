package assignment;

public class A3 {

	public static void main(String[] args) {
		
		StringBuffer s1= new StringBuffer("SeleniumJava");
		String m="ILoveIndia";
		
		//reverse the string
		System.out.println(s1.reverse());
		//delete "Java"
		System.out.println(s1.delete(0, 4));
		//find index of 'm'
		System.out.println(s1.indexOf("m"));
		//find character present at index 5
		System.out.println(s1.charAt(5));
		
		
		//replace 'I' by 'm'
		System.out.println(m.replace('I', 'm'));
		//find character present at 3
		System.out.println(m.charAt(3));
		//display "Love" alone
		System.out.println("Love");
		
		

		
		
	}

}
