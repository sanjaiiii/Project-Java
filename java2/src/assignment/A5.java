package assignment;

import java.util.ArrayList;

public class A5 {

	public static void main(String[] args) {
		
		ArrayList<Character>lc=new ArrayList<>();
		
		lc.add('a');
		lc.add('b');
		lc.add('c');
		lc.add('d');
		lc.add('e');
		lc.add('f');
		
//1. Create a character  list, add elements, remove elements, retrieve element and iterate through it
		
		System.out.println(lc);
	//add elements
		lc.add('g');
		System.out.println(lc);
	//remove elements
		lc.remove(5);
		System.out.println(lc);
	//retrieve element
		System.out.println(lc.get(3));
	//iterate through it
		for (Character i:lc)
		{System.out.println(i);}
		
		
		
		
		
		
		
	}

}
