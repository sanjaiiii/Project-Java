package encapsulation;

public class e3 {

	public static void main(String[] args) {

	}

	private String lcred;
	private String pcred;
	
	public void setter(String l, String p) {
		
		lcred=l;
		pcred=p;
	}
	
	public void getter() {
		
		System.out.println(lcred);
		System.out.println(pcred);
	}
	
	
}
