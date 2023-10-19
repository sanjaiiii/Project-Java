package final_k_word;

final public class f1 {

	
	//1.(Final variables cannot be assigned)	
	
	final int age = 40;
	
	//2.(Final class cannot be connected)
	//now let's declare this class as final and check whether we can connect
	
	//3.(Final methods cannot be overridden)
	//.creating a new parent and child class to override
	
	public static void main(String[] args) {

		

	}

	
	public void a() {
		
		age=50; //Throwing an error as cannot be assigned.
//once the variable is declared as final variable we can't re assign the value.
//we have to re assign the value straightly if we want 		
	}
	
	
}
