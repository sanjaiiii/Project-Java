package CollectionFramework;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
/*Map: A Map is an object that maps keys to values.
 * 
 * Not index based.
 * we can add
 * remove
 * retrieve
 * 
 *There are 3 types:
 *
 *Note(The orders of the map will be applicable to keys only)
 *
 *TreeMap        --> Alphabetical or Ascending order (Natural Order)
 *LinkedHashMap  --> Insertion order (Will be the same as we add)
 *HashMap        --> Unpredictable Order
 * 
 * Syntax:
 * TypeofMap<datatypeofkey, datatypeofelements> name = new TypeofMap<>();
 * 
 */
		
	
		HashMap<String,Integer> m=new HashMap<>();
		
		m.put("Sanjay", 444);
		m.put("Sathish", 404);
		m.put("Sk", 430);
		m.put("sandy", 456);
		
		
		System.out.println(m);
		
		
		//to remove
		m.remove("sandy");
		System.out.println(m);
		
		//to view the key's alone
		System.out.println(m.keySet());
		//to view the values alone
		System.out.println(m.values());
		
		
		
		
	}

}
