package assignment;

public class A11 {

	public static void main(String[] args) {
		
		
		A11.d1();
		A11.d1("Sanjay", 25);
		A11.d1("Medusind Solutions,Coimbatore");
		
		A11 ob = new A11();
		ob.add();
		ob.add(100, 1.1);
		ob.add(100, 200.23, 340.56f);
		
		ob=new A11();
		ob=new A11(25);
		ob=new A11("Area of a triangle is:");
		ob=new A11(23.4,34.5f);
	}

	public static void d1() {
		
		System.out.println("Details:");
	}
	
	public static void d1(String name,int age) 
	{
	System.out.println("Name is "+name);
	System.out.println("Age is "+age);
	}
	
	public static void d1(String com) {
		System.out.println("Company details is "+ com);
		
	}
    
	
    public void add() {
		
		System.out.println("Addition Results: ");		
	}
	public void add(int a, double b) {
		
		System.out.println("The Addition of 2 num is "+ a+b);		
	}
	
    public void add(int a, double b, float c) {
		
		System.out.println("The Addition of 3 num is "+ a+b+c);		
	}
	
	
    public A11() {
		System.out.println("Overloading a Constructor");}
	
    public A11(int s) {
		System.out.println((s*s)+" is the area of square ");}
    
	public A11(String a) {
		System.out.println(a);
	}
	public A11(double b,float h) {
		System.out.println(b*h/2);
	}

}
