package com.naveen.set;

 
import java.util.*;

public class HashSetPracties {

	public static void main(String[] args) {
 
		//create set
		
		Set<Integer> s1 = new HashSet<>();
		
		//add elements into set
		s1.add(100);
		s1.add(200);
		s1.add(300);
		s1.add(400);
		s1.add(500);
		s1.add(500);
		s1.add(null);
		
		
		System.out.println(s1); //[400, null, 100, 500, 200, 300]
		
		//delete the elements from set 
		
	System.out.println(s1.remove(100));	 //return true
//		s1.removeAll(s1);
//		s1.clear();
		
		System.out.println(s1);
		
		// elements and Contains
		 System.out.println(s1.contains(100)); //false
		 System.out.println(s1.contains(500)); //true
		 
		 for(Integer ele:s1) {
			 System.out.println(ele);
		 }
		
 	
	}

}
 

       /*   *****Important*****
        *  Hashing Mechanism
        *  Hash set aneedi data store chesukoovadaaniki internal ga HashMap ni use cheesukuntundhi -->HashMap Aneedhi Array of nodes(key,value)
        *  Integer are act as key in HashMap  , vales are dummy object like new Object(); 
        *  Set doesn't allow duplicates
        *  Set Allow one null value
        *  Set is not index 
        *  It doesn't maitain insertion order
        */
