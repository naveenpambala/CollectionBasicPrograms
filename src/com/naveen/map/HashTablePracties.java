package com.naveen.map;

import java.util.*;
import java.util.Map.Entry;

public class HashTablePracties {

	public static void main(String[] args) {
		 
		// creating the map
		
		Map<Integer, String> m = new Hashtable<>();
		
		
		// Adding the eleents into HashTable
		
		m.put(101, "Hyd");
		m.put(102, "null");
		m.put(103, "Knr");
		m.put(104, "Pdpl");
		
		System.out.println(m);//{104=Pdpl, 103=Knr, 102=null, 101=Hyd}
		System.out.println(m.size());//4
		
		
		// Retrival Key from the map
		
		 Set<Integer> keys =m.keySet();//By using keySet() aneedi set of keys or set of object ni return cheesthadi 
		  
		 for(Integer key: keys) {
			 System.out.println(key);
		 }
		 System.out.println();
		 
		// Retrival values from the map
		 Collection<String> values= m.values();//By using values() method retriving the values from map and It can return Collection Strings
		 
		 for(String value:values) {
			 System.out.println(value);
			 
		 }
		 System.out.println();
	  // Retrival values from the map by using key
		 
		 System.out.println(m.get(103));
		 System.out.println(m.get(109));//null [get out of box key it can return null]
		 
		 //Delete of elements from the map
		 
		 m.remove(103); //By using key
//		   (or)
//		 m.remove(103,"Knr"); // By using key and Value both are performing same
		 System.out.println(m);
//		 m.clear();//{}  entire map can delete and it wont return anything 
		 
		 
		 //Key are present or not
		 
		 System.out.println(m.containsKey(102));// true   Key is present or not 
		 System.out.println(m.containsKey(103)); //false 
		 System.out.println(m.containsValue("Hyd"));//true Value is present or not
		 
		 
		 //Updation of values
		 // in map updating the values we are re-adding the value
		 
		 m.put(104, "Ameerpet");
		 System.out.println(m);
		 
		 m.putIfAbsent(104, "Benguluru");//putIfAbsent if i am not updating here  i am adding "Benguluru" value if 104 key not present in map
		 m.put(103, "Benguluru");
		 System.out.println(m);
		 
		 // in map we are using replace method to update the values
		 m.replace(104, "Hitech city");
		 System.out.println(m);
		 
		 // Retriving Key And Value By using EntryKey
		 
		Set<Entry<Integer, String>> entries= m.entrySet();// It Return the set of Key and values
		 
		 for(Entry<Integer, String> entrie:entries) {
			 Integer key = entrie.getKey();
			 String value =entrie.getValue();
			 
			 System.out.println(key +"=======> "+ value);
		 }
		 
		 
		 
	}

}
