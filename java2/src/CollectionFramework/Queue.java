package CollectionFramework;

import java.util.concurrent.ArrayBlockingQueue;

public class Queue {

	public static void main(String[] args) {


		/*Queue
		 *
		 *Not Based on the index.
		 *Accept duplicates.
		 *add
		 *remove
		 *It is size limited
		 *Only the head of the queue can be retrieved
		 *It can be Iterated.
		 *
		 *
		 *Syntax:
		 *ArrayBlockingQueue<datatype> name = new ArrayBlockingQueue<>(size);
		 * 
		 */
		
		
		ArrayBlockingQueue<Double> q = new ArrayBlockingQueue<>(5);
		
		q.add(1.23);
		q.add(1.24);
		q.add(1.25);
		q.add(1.26);
		q.add(1.23);
	System.out.println(q);
	
	//To remove the specific element in the list
	q.remove(1.23);
	System.out.println(q);
	
	//retrieval:peek (Only the head of the queue can be retrieved)
	System.out.println(q.peek());
	
	//to iterate
	for(Double i:q)
	{
		System.out.println(i);
	}
	
	
	
	
	
	
	
	
	}

}
