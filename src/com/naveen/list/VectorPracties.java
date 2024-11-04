package com.naveen.list;

import java.util.Arrays;
import java.util.Vector;

public class VectorPracties {

	public static void main(String[] args) {
		 
		//when we are create the vector ,vector is create the intial capaciy is 10, and we can add the more than 10 Values 
		//vector size will be increase like 10,20,30,40,50.....	Increase the space 100%(like 10,20,30)	
		//size - no.of elements present  in the vector
		//capacity- Array Capacity (like 10,20,30,40,50.....)
		
		
		Vector<String> v1 = new Vector<>();
		
		//Adding the elements into vector
		  v1.add("Java");
		  v1.add("Spring");
		  v1.add("SpringBoot");
		  
		  Vector<String> v2 = new Vector<>();
		  v2.add("MySql");
		  v2.add("Microservices");		  
		  v2.add("PostgreeSQL");
		  
		  System.out.println(v1);
		  System.out.println(v2);
		  
		  System.out.println("=======================================");
		  // Adding the elements in particular index values
		  v1.add(0,"Angular");
		  v2.add(0,"HTML");
		  
		  //v2.addAll(v1); v2 adding into v1 last index
			v2.addAll(0, v1); // v2 adding first index
		  
		  System.out.println(v2); //[Angular, Java, Spring, SpringBoot, HTML, MySql, Microservices, PostgreeSQL]
		  
		  
		// Check size and capacity
		  
//		  System.out.println("V1 Size :-" + v1.size()); //V1 Size :-4
//		  System.out.println("V1 Capacity:-" + v1.capacity()); //V1 Capacity:-10
//		  System.out.println("V2 Size :-" + v2.size()); //V2 Size :-8
//		  System.out.println("V2 Capacity:-" + v2.capacity());//V2 Capacity:-10
		  
		  
		//Retriving the elements from the vector BY USING GET 
		  
		  System.out.println(v1.get(0)); //Angular
		  
		  
		//Deleting the Elements From List
		  
		  System.out.println(v1.remove(0));//Angular [ return oldValue]
		  System.out.println(v1.removeAll(v2)); //true
//		  System.out.println(v2.removeAll(v1));
		  
//		  v1.clear();// {}  entire list can delete and it wont return anything 
		  
		  System.out.println(v1);//[]
		  
			//Verifictation of elements
			
//			System.out.println(v1.contains(v2));
//			System.out.println(v2.containsAll(v1));
		  
		  
			//you want know Index of purticuar elements
		  
//			System.out.println(v2.indexOf("java"));
//			System.out.println(v2.firstElement());
//			System.out.println(v2.lastElement());
		  
		  
//		  ArrayList Convert To Array
		  
		  Object[] arr = v2.toArray();
		  System.out.println(Arrays.toString(arr)); //[Angular, Java, Spring, SpringBoot, HTML, MySql, Microservices, PostgreeSQL]
		  
		  Vector<Integer> v3 = new Vector<>();
		  v3.add(100);
		  v3.add(null);
		  v3.add(null);
		  v3.add(100);
		  
		  System.out.println(v3); //[100, null, null, 100]
		  
	
		  
	}

	
}

          /*	  **********Important ********

         => default Capacity --> 10(before adding the elements)
         => initial Capacity --> 10(after adding one elemets ,entha capacity tho add avuthundi ani)
         => Increase the space 100%(like 10,20,30)
         => Null values Allow
         => Duplicated Values Allow
         => Maitain Insertion Order
         => Sorting order not Maintain (values ni sort cheesi print cheyyadam) AND Insertion and Sorted Both are Quite Opposite
         => we can access the elements Randamly
         => vector is sychronized (that means is won't allow multiple threads,allow one by one thats why synchronized) 
         => Used Sistuations--> Multithreading(working with multiple threads) and data is inceased exponentially

           */  
