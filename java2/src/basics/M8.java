package basics;

public class M8 {

	public static void main(String[] args) {
		
		M8 ob=new M8();
		System.out.println(ob.addition());
		System.out.println(ob.txt());
		System.out.println("The area of semicircle is "+ ob.area());
        ob.details("Sanjay", 26);
        System.out.println("The division of 2 num is "+ ob.division(2.2f,48.98f));
	}

	public int addition() {
		int a1=35;
		int a2=45;
		return a1+a2;
		
	}
	
	private String txt() {
		
		String d="Hi ";
		
		return(d+"sanjay");
		
	}
	
	public float area() {
		
		float b=3.14f;
		return 1/2*b;
		
	}
	
	public void details(String name, int age) {
		
		System.out.println("Name is name" + "Age is age");
		
	}
	
	private float division(float d, float d1) {
		
		return d1/d;
		
	}
	
	
	
}
