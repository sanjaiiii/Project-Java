package assignment;

import java.util.HashSet;

public class A9 {

	public static void main(String[] args) {
		
//Create a float hash  set, add elements, remove elements and iterate through it 		
		HashSet<Float> h= new HashSet<>();
		
		h.add(1.10f);
		h.add(2.20f);
		h.add(3.30f);
		System.out.println(h);
		//add elements
		System.out.println(h);
		//remove
		h.remove(4.40f);
		System.out.println(h);
		//iterate
		for(Float x: h)
		{System.out.println(x);}
		

		
	}

}
