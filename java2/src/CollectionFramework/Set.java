package CollectionFramework;


import java.util.LinkedHashSet;

public class Set {

	public static void main(String[] args) {

/*Set
 *Not Index based
 *can add or remove
 *iterate
 *cannot retrieve(Not Possible)
 *Duplicates will be ignored(Won't throw Error)
 *
 *There are 3 types:
 *TreeSet        --> Alphabetical or Ascending oreder (Natural Order)
 *LinkedHashSet  --> Insertion order (Will be the same as we add)
 *HashSet        --> Unpredictable Order
 * 
 * Syntax:
 * Typeofset<datatype> name = new Typeofset<>();
 * 
 */
		
		
		
		LinkedHashSet<Integer> s = new LinkedHashSet<>();
		
		s.add(10);
		s.add(100);
		s.add(50);
		s.add(500);
		s.add(1000);
		System.out.println(s);
		
		//To remove the specific element in the list
		s.remove(10);
		System.out.println(s);
		//Size of the list
		System.out.println(s.size());
		//Iterate
		for(Integer i:s) 
		{
			System.out.println(i);	
		}
		
		
		
		
	}

}
