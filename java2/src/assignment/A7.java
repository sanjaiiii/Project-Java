package assignment;

import java.util.ArrayList;

public class A7 {

	public static void main(String[] args) {
		ArrayList<Float>lf=new ArrayList<>();
		
		lf.add(1.1f);
		lf.add(2.22f);
		lf.add(3.333f);
		lf.add(4.4444f);
		
		//1. Create a String  Float, add elements, remove elements, retrieve element and iterate through it
		
		System.out.println(lf);
	//add elements
		lf.add(2,5.55555f);
		System.out.println(lf);
	//remove elements
		lf.remove(0);
		System.out.println(lf);
	//retrieve element
		System.out.println(lf.get(3));
	//iterate through it
		for (Float g : lf)
		{System.out.println(g);}
		




	}

}
