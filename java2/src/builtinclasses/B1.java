package builtinclasses;

public class B1 {

	public static void main(String[] args) {
		
	/*
	 *String is immutable & Static in nature.
	 */
		
		String a="weLCome";
		
		System.out.println(a.length());
		System.out.println(a.indexOf('m'));
		System.out.println(a.charAt(5));
		
		//Conversion
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		
		//Concatenation
		System.out.println(a+" hi");
		System.out.println(a.concat(" HI"));
		
		//replace:single
		System.out.println(a.replace('C', 'L'));
		//replace:sequence
		System.out.println(a.replace("Come", "Done"));		
		
		//Checking
		System.out.println(a.contains("om"));
		
		
	}

}
