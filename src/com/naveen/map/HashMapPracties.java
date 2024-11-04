package com.naveen.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPracties {

	public static void main(String[] args) {

            //create map
		Map<Integer,String> m1 = new HashMap<>();
		
		// Adding the elements
		
		     m1.put(10, "Ten");
		     m1.put(20, "Twenty");
		     m1.put(30, "Thirty");
		     m1.put(40, "Fourty");
		     m1.put(50, "Fifty");
		     m1.put(null, null);
//		     m1.put(null, null);
		     m1.put(null, "Sixty");
		     
		     
		     
		     System.out.println(m1);//{null=null, 50=Fifty, 20=Twenty, 40=Fourty, 10=Ten, 30=Thirty}
		     System.out.println(m1.size()); //6
		     
		     
		  // Retrival Keys from the map
		     Set<Integer> keys=m1.keySet(); //By using keySet() aneedi set of keys or set of object ni return cheesthadi
		     
		     for(Integer key:keys) {  
		    	 System.out.println(key);
		     }
		     
		     System.out.println();
		     // Retrival values from the map  
		     
		   Collection<String> values=  m1.values();  //By using values() method retriving the values from map and It can return Collection Strings
		   
		   for(String value: values) {
			   System.out.println(value);
			   
		   }
		   System.out.println();
		   
		   //Retrival value from map using--> get 
		  
		   System.out.println(m1.get(3));//null [get out of box key it can return null]
		   System.out.println(m1.get(50));//fifty
		   
		   
		   //Delete of elements from the map
		   
		   m1.remove(10);//remove by using key
		   
		   m1.remove(20,"Twenty");// by using key and value  but result wil be same
		   System.out.println(m1);
		   
//		   m1.clear();//{}  clear the list
		   
		   System.out.println();
		 //Key are present or not
		   
		   System.out.println(m1.containsKey(40)); //true
		   System.out.println(m1.containsKey(10)); //false
		   System.out.println(m1.containsValue("Fourty")); //true
		   System.out.println(m1.containsValue( "Ten")); //false
		   
		   
		   System.out.println();
		   //Updation of values
		  // in map updating the values we are re-adding the value
		   m1.put(50, "Seventy");
		   m1.put(10, "Ten");
		  
		   m1.putIfAbsent(104, "Benguluru");//putIfAbsent if i am not updating here  i am adding "Benguluru" value if 104 key not present in map
		   System.out.println(m1);
		
		   // we can use raplace method of update the values from value
		   m1.replace(104, "OneNotFour");
		   System.out.println(m1);
		   
		   System.out.println();
		// Retriving Key And Value By using EntryKey
		   		
		  Set<Entry<Integer, String>> entries= m1.entrySet(); //it can return key and values
		  
		  for(Entry<Integer,String> entrie:entries) {
			  Integer key =entrie.getKey();
			  String value =entrie.getValue();
			  System.out.println(key +"=====>"+ value);
			  
		  }
	}

}

         /*  *********Impoetant************
          * HashMap aneedi data ni store cheesukoovadaaniki internal gha Array of nodes(key,values)
          * doesn't maintain insertion order
          * only one null key allowed
          * dupliacate values allowed
          * 
           
           
           */
