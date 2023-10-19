package assignment;

import java.util.concurrent.ArrayBlockingQueue;

public class A8 {

	public static void main(String[] args) {

//create a character  queue, add elements, remove elements, retrieve element and iterate through it
		ArrayBlockingQueue<Character> c1= new ArrayBlockingQueue<>(5);
		
		c1.add('a');
		c1.add('b');
		c1.add('c');
		c1.add('d');
		System.out.println(c1);	
		//add elements
		c1.add('e');
		System.out.println(c1);
		//remove elements
		c1.remove('b');
		System.out.println(c1);
		//retrieve element
		System.out.println(c1.peek());
		//iterate
		for(Character x: c1)
		{System.out.println(x);}
		
	}

}
