package com.naveen.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPracties {

	public static void main(String[] args) {
	 
		// when we create the Linked List, Linked List Intial capacity is '0'
		// when we add the one element than capacticy is '10'
		// Size will be increase 50% like 10,15,22,33 
		// Size - no.of elements in the Linked List
		//Capacity - before adding element into list
		
		
	LinkedList<Integer> l1 = new LinkedList<>();
				//adding elements into Linked List
				l1.add(100);
				l1.add(200);
				l1.add(300);
				l1.add(300);
	 				
				ArrayList<Integer> a1 = new ArrayList<>();
				a1.add(10);
				a1.add(20);
				a1.add(30);
				
//				System.out.println(a1);
				l1.addAll(a1); //adding Arraylist object to LinkedList	
			//	l1.addAll(0,a1); // a1 adding particular index value
				System.out.println(l1);
				
				
				
				//Deleting the element fro Linked List
//				
//				l1.remove(1); //delete the 1st index element   //200 [ return oldValue]
//				l1.removeAll(a1); // delete all elements at a time:=true
//				l1.clear();// {}  entire list can delete and it wont return anything 
//				System.out.println(l1);
				
				
			  //LINKED LIST of elements
				
				System.out.println(l1.contains(100));//true
				System.out.println(l1.contains(a1));//false
				System.out.println(l1.containsAll(a1));//true
				
				
				//you want know Index of purticuar elements
				
				System.out.println(l1.indexOf(10));//3
				System.out.println(a1.lastIndexOf(l1));
				
				//update elements from Linked List
				
			l1.set(0, null);
			l1.set(1,200);
			System.out.println(l1);
			
				//Getting the elements from Linked List
			System.out.println(l1.get(0));
			System.out.println(l1.getLast());
			
			// getting the elements by Using "For LOOP"
			 for (int i=0; i<l1.size(); i++) {
				 System.out.println(l1.get(i));
			 }
			 
			// getting the elements by Using "For Each LOOP"
			 for(Integer n:l1) {
				 System.out.println(n);
			 }
			 
			 
			 
			//not synchronized so 
			 
			 Collections.synchronizedList(l1);
			 Collections.synchronizedList(a1);
			 
			 
			 
	}
				 
}



			/*	******important******
			 
			 * LinkedList data ni save chesukoovadaaniki  internal gha Multiple nodes ni use cheesukuntadi 
			 * Default Capacity -- 0  (elements are not add to the list),(memory space will safe)
			 * Intial Capacity -- 10
			 * Increasing the size 50% [Ex:- intial size 10,15(10 lo 50% 15),22(15 lo 50% 22),33(22 lo 50% 33)]
			 * Duplicate values Allowed
			 * Null values Allowed
			 * when we add the element node will create 
			 * Maitain Insertion order
			 * Sorting order not maintain (values ni sort cheesi print cheyyadam) AND Insertion and Sorted Both are Quite Opposite
			 * We acceses of elements randamly
			 * Linked List is Synchronized when we use Collection class,out of the box we can provide synchronize
			 * By default LinkedList is Not Synchronized (thats mean it can allow multiple threads , So Some problems came that's why we are add explicitly Synchronization,its Performance will increase because of working multiple things at a time)
			 *  Used Sistuations-->  data manipulation( updation purpose)
			 *  
			 *  Linked List 2 Types 
			 *  1) Single (next)
			 *  2)double Linked List (next,prvious) [in java we are using double linkedList]
				
				
				
				
				*/
