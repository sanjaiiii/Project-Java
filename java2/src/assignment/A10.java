package assignment;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class A10 {

	public static void main(String[] args) {

    HashMap<Character,Integer> h= new HashMap<>();
    
    h.put('y', 100);
    h.put('s', 100);
    h.put('k', 100);
    h.put('l', 100);
    System.out.println(h);
    //remove
    h.remove('k');
    System.out.println(h);
    //keys
    System.out.println(h.keySet());
    //values
    System.out.println(h.values());
    TreeMap<Double,String> t= new TreeMap<>();
    t.put(1.1, "One");
    t.put(2.2, "Two");
    t.put(3.3, "Three");
    t.put(4.4, "Four");
    System.out.println(t);
  //remove
    t.remove(1.1);
    System.out.println(t);
    //keys
    System.out.println(t.keySet());
    //values
    System.out.println(t.values());
    
    Hashtable<String,Boolean> ht=new Hashtable<>();
    ht.put("We can feel Air", true);
    ht.put("25 hours per day", false);
    ht.put("Bulidings & Cars is an Asset", true);
    ht.put("Aug-15 is Republic Day", false);
    System.out.println(ht);
  //remove
    ht.remove("We can feel Air");
    System.out.println(ht);
    //keys
    System.out.println(ht.keySet());
    //values
    System.out.println(ht.values());
    
    
    
    
	}

}
