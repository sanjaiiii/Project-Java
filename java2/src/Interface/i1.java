package Interface;

public class i1 implements intro{

	public static void main(String[] args) {
		

		i1 ob = new i1();
		ob.ab();
		ob.nm("This is the Normal Method");
		
	}

	@Override
	public void ab() {
		System.out.println("It is Abstract Method");
		
	}

}
