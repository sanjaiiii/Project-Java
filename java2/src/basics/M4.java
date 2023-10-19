package basics;

public class M4 {

	public static void main(String[] args) {
		
		System.out.println("Area of triangle " + M4.t());
		M4 ob= new M4();
		System.out.println("Perimeter of rectangle is " + ob.peri());
		ob.a();
		System.out.println("Age is " + ob.age(25));
		System.out.println("Product of 3 num is "+ M4.product());		
	    System.out.println(M4.name());
	    M4.sub();
	    System.out.println("Area of rhombus is " + M4.rhombus());
	    System.out.println(ob.ap());
	    ob.sdetails();
	}

	//1.Find area of triangle using static method and return its result
	
	public static double t() {
		
		double h=34.56;
		double b=56.67;
		return b*h/2;	
	}
	//2. Find perimeter of rectangle using non static method and return its result
	
	 private int peri() {
		 
		 int L=50;
		 int W=60;
		 return L+W*2; 
	 }
	//3. Find average of four numbers using non static (use void)
	 
	 public void a() {
		 int a=100;
		double b=200.20;
		float c=300.30f;
		int d=400;
		System.out.println("Average of 4 num is " +(a+b+c+d/4));		
			 
	 }
	 
	 //4.Create a non static method that returns age
	 
	 private int age(int a) {
		 
		 return a;
	 }
	 
	 //5.create a static method that returns product of three numbers
	 
	 private static int product() {
		 int p1=30;
		 int p2=40;
		 int p3=50;
		 
		return p1*p2*p3;		 
		 
	 }
	 
	 //6.create a static method that returns name
	 
	 private static String name() {
		 
		 return ("Name : Sanjay");
	 }
	 
	 //7.Find subtraction of two numbers using static method
	 
	 public static void sub() {
		
		int s1=100;
		int s2=50;
		
		System.out.println("Subtraction of 2 num is "+ (s1-s2));		
		 
	 }
	 
	 //Find area of rhombus using static method and return its result (0.5*diagnal1*diagonal2)
	 
	 public static double rhombus() {
		 double diagna=11.30;
		 double diagona=12.40;
		 
		 return 0.5*diagna*diagona;
		 
	 }
	//Find area of parallelogram using non static method and return its result
	 
	 public float ap() {
		 
		 float base = 45.9f;
		 float side = 40.5f;
		 
		 return 2*base+side;
		 
	 }
	
	 //Display student details using non static method
	 
	 public void sdetails() {
		 
		 System.out.println("Name: sanjay, Age: 18, Id: 123456, Phone number: 9345523819");
		 
	 }
	 
	 
	 
	 
	 
	 
}
