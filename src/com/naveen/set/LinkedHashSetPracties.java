package com.naveen.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPracties {

	public static void main(String[] args) {
 
		//create set
		
				Set<Integer> s2 = new LinkedHashSet<>();
				
				//add elements into set
				s2.add(100);
				s2.add(200);
				s2.add(300);
				s2.add(400);
				s2.add(500);
				s2.add(500);
				s2.add(null);
				
				
				System.out.println(s2); //[400, null, 100, 500, 200, 300]
				
				//delete the elements from set 
				
			System.out.println(s2.remove(100));	 //return true
//				s2.removeAll(s2);
//				s2.clear();
				
				System.out.println(s2);
				
				// elements and Contains
				 System.out.println(s2.contains(100)); //false
				 System.out.println(s2.contains(500)); //true
				 
				 System.out.println();
				 for(Integer ele:s2) {
					 System.out.println(ele);
				 }
				 System.out.println();
				System.out.println(s2.size());// 5 
				System.out.println(s2.isEmpty());//false
				 
				 
				 
				 
	}

}

			/*   *****Important*****
                *  Hashing Mechanism
                *  Hash set aneedi data store chesukoovadaaniki internal ga LinkedHashMap --> link of nodes(key,values)
                *  Integer are act as key in LinkedHashMap  , vales are dummy object like new Object(); 
                *  Set doesn't allow duplicates
                *  Set Allow one null value
                *  Set is not index 
                *  It  maitain insertion order
                */