package com.naveen.set;

 
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPracties {

	public static void main(String[] args) {
		 
		//create set
		// new Object(); dummy object 
		TreeSet<Integer> s3= new TreeSet<>();
		
		//add elements into set
		s3.add(400);
		s3.add(100);
		s3.add(200);
		s3.add(500);
		s3.add(300);		
		s3.add(500);	
		 
		
		
		System.out.println(s3); 
		//get lowest number and Highest number 
		
		System.out.println(s3.first()); //100
		System.out.println(s3.last()); //500
		 
		System.out.println();
		// remove elements 
//		System.out.println(s3.remove(100));
		System.out.println(s3.pollFirst());//remove first element 100
		System.out.println(s3.pollLast());// remove last eleme    500
		
		
		System.out.println(s3);//[200, 300, 400]
 
		
		//IN  String  creating substring  And IN Ser we are creating SubSet
		
		System.out.println(s3.subSet(4, 400)); // it can print range between them [200, 300] Its a verchval set if any operatonrations are perforn on subset its effect to main set like remove,add 
		
		//descending Set
		System.out.println("descendingSet "+s3.descendingSet());
		
		
		 

	}

}

/*   *****Important*****
 *  Hashing Mechanism
 *  Hash set aneedi data store chesukoovadaaniki internal ga TreeMap --> binary tree
 *  Integer are act as key in TreeMap  , vales are dummy object like new Object();
 *  Set doesn't allow duplicates
 *  Set  not null value
 *  Set is not index 
 *  It  maitain sorted order
 */
