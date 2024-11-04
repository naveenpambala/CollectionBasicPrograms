package com.naveen.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapPracties {

	public static void main(String[] args) {
		// create Map
		Map<Integer, String> m3 = new TreeMap<>();
		// Adding elements into map

		m3.put(50, "Fifty");
		m3.put(40, "Fourty");
		m3.put(30, "Thirty");
		m3.put(20, "Twenty");
		m3.put(10, "Ten");

		System.out.println(m3); // {50=Fifty, 40=Fourty, 30=Thirty, 20=Twenty, 10=Ten, null=nulll}
		System.out.println(m3.size());// 6

		System.out.println();
		// Retrival Keys from the map
		Set<Integer> keys = m3.keySet();// By using keySet() aneedi set of keys or set of object ni return cheesthadi
		for (Integer key : keys) {
			System.out.println(key);
		}

		System.out.println();
		// Retrival values from the map
		Collection<String> values = m3.values(); // By using values() method retriving the values from map and It can
													// return Collection Strings

		for (String value : values) {
			System.out.println(value);
		}

		System.out.println();
		// Retrival value from map using--> get

		System.out.println(m3.get(1)); // null [get out of box key it can return null]
		System.out.println(m3.get(10)); // Ten

		// Delete of elements from the map
		m3.remove(10);// remove by using key
		System.out.println(m3.remove(20, "Twenty"));// by using key and value but result wil be same
		System.out.println(m3);

//						   m3.clear();//{}  clear the list

		System.out.println();
		// Key are present or not
		System.out.println(m3.containsKey(10));// false
		System.out.println(m3.containsKey(40)); // true
		System.out.println(m3.containsValue("Ten"));// false
		System.out.println(m3.containsValue("nulll"));// true

		System.out.println();
		// Updation of values
		// in map updating the values we are re-adding the value

		m3.put(40, "Ten");
//		m3.put(null, "Not Null");
		System.out.println(m3);

		//

		m3.putIfAbsent(60, "Sixty"); // putIfAbsent if i am not updating here i am adding "Benguluru" value if 104
										// key not present in map

		System.out.println(m3);

		// we can use raplace method of update the values from value
		m3.replace(40, "Fourty");
		System.out.println(m3);

		System.out.println();
		// Retriving Key And Value By using EntryKey
		Set<Entry<Integer, String>> ss1 = m3.entrySet();
		for (Entry<Integer, String> ss2 : ss1) {
			Integer key = ss2.getKey();
			String value = ss2.getValue();
			System.out.println(key + "========>" + value);
		}
		
		//Iterate Map Throught Iterator
//		     Set<Integer> itrkeys =m3.keySet();
//		    Iterator<Integer> itr= itrkeys.iterator();
//		    
//		    while(itr.hasNext()) {
//		    	Integer itrkey=itr.next();
//		    	    String value=m3.get(itrkey);
//		    	    System.out.println(itrkey+"====="+ value);
//		    }
		
		
		
		
		
		
		
		

	}

}
