package CollectionFramework;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		
		
 //Hashtable is just as same as the Hashmap.
		
//Hashtable--> initially Order will be provided and that would be the same till the last
		
//Syntax:Hahstable<datatypeofkey, datatypeofelements> name = new Hashtable<>();		
		
		
Hashtable<String,Integer> t=new Hashtable<>();
		
		t.put("Sanjay", 444);
		t.put("Sathish", 404);
		t.put("Sk", 430);
		t.put("sandy", 456);
		
		System.out.println(t);
		
		
		//to remove
		t.remove("sandy");
		System.out.println(t);
		
		//to view the key's alone
		System.out.println(t.keySet());
		//to view the values alone
		System.out.println(t.values());
			
	}

}
