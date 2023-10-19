package operators;

public class O1 {

	public static void main(String[] args) {
		// arithmetic operators:   +,-,*,/
		//comparision operators:   <,>,<=,>=,==,!=
		//assignment operators :   +=,-=,*=,/=
		// conditional operator:   condition ? true : false    => ternary operator
		//logical operators: and, or , not
		int age=3;
		//System.out.println(age);
		//add 20 to age
		//System.out.println(age+=20);
		
		//sub 10 from age
		//System.out.println(age-=10);
		
		//mul age by 2
		//System.out.println(age*=2);
		
		//divide age by3
		//System.out.println(age/=3);
		//                   cond ?  true    : false
		System.out.println(age>18 ?  "Major ": "minor");
		
		/*and   :     &&
		 * 
		 * 
		 * con1   cond2      output
		 * 
		 * True    True      True
		 * True    false     false
		 * False   True      false
		 * false   false     false
		 * * 
		 * 
		 * 
		 * or   : ||
		 * 
		 * 
		 * con1   cond2      output
		 * 
		 * True    True      True
		 * True    false     True
		 * False   True      True
		 * false   false     false
		 * 
		 * 
		 * not operators: !
		 * 
		 * true=> false
		 * false=> true
		 * */
		int m=90;
		int n=30;
		System.out.println("and operator ");
		
		System.out.println(m>20 && n==30);
		System.out.println(m>20 && n==0);
		System.out.println(m==20 && n==30);
		System.out.println(m<0 && n==0);
		System.out.println();
System.out.println("Or operator ");
		
		System.out.println(m>20 || n==30);
		System.out.println(m>20 || n==0);
		System.out.println(m==20 || n==30);
		System.out.println(m<0 || n==0);
System.out.println();
System.out.println("Not operator");
System.out.println(n==0);
System.out.println(m!=0);
	}

}
