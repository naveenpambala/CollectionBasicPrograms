package com.naveen.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPracties {

	public static void main(String[] args) {
		 
		// default capacity -- 0 (before adding the elements)
		//intial capacity -- 10 (after adding the one single element)
		//size wii increase the 50%
		
		ArrayList<String> a1 = new ArrayList<>();
		
		//adding the elements into Array list
			a1.add("java");
			a1.add("python");
			a1.add("mysql");
			a1.add("html");
			a1.add("java");
			a1.add(null);
			
			
			System.out.println(a1); //[java, python, mysql, html, java, null]
			System.out.println(a1.size()); //6
			 
			
			//Array to ArrayList
			String[] arr = new String[] {"one","two","three"};
			
			ArrayList<String> a2 = new ArrayList<>(Arrays.asList(arr));
			
			System.out.println("a2 "+ a2); //[one, two, three]
			
			//remove elements from ArrayList
			
//			a1.remove(0);
//			a1.removeAll(a1);
//			a1.clear();//{} entire list can delete and it wont return anything  
			
			// Get values from list using GET
			
			System.out.println(a1.get(0)); //java			
//			System.out.println(a1.get(6)); // Index 6 out of bounds for length 6
			
			 //update of list elements
			
			a1.set(0, "Css");
			a1.set(3, "Html");
			System.out.println("a1 updated "+ a1); //[Css, python, mysql, Html, java, null]
			
			// Containts or not
			
			
			System.out.println(a1.contains(a2)); //false
			System.out.println(a1.contains("Css")); //true
			
			// getting the elements by Using "For LOOP"
			
			for (int i = 0; i <a1.size(); i++) {
				System.out.println(a1.get(i));
				
			}
		 
			//getting the elements By using "For Each"
			System.out.println("================");
			for(String x:a1) {
				System.out.println(x);
			}
			
			//Explicitly synchronization
			
			Collections.synchronizedList(a1);
			
			
		

	}

}


			/*   ******important******
			    *  ArrayList data ni save chesukoovadaaniki  internal gha Arrays ni use cheesukuntadi
			 	* default capacity ---0 (elements are not add to the list),(memory will save)
	            * intial capacity --10(means before adding elements),(memory will save)
	            * only 50% space ni matramey inctrease chesthadi(memory will save)
	            * duplicates allow 
	            * null allow
	            * maintain insertion order
	            * sorted order not maintain(values ni sort cheesi print cheyyadam) AND Insertion and Sorted Both are Quite Opposite
	            * we access of elements randamly
	            * ArrayList is not sychronized (that mean allow multiple threads,so some problem came thats why we are using explicitly add synchronization,its morperformance becasue of multiple working do) 
	            * Used Sistuations--> elements adding or retriving
	            
                
               */
