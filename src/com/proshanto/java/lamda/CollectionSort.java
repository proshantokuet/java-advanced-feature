package com.proshanto.java.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSort {
	
	public static void main(String[] args) {
		
		// Create a list of strings
        ArrayList<String> al = new ArrayList<String>();
        al.add("Geeks For Geeks");
        al.add("Friends");
        al.add("Dear");
        al.add("Is");
        al.add("Superb");
       
      
  
        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al);
  
        // Let us print the sorted list
        System.out.println("List after the use of" +
                           " Collection.sort() :\n" + al);
        
        ArrayList<String> all = new ArrayList<String>();
        all.add("Geeks For Geeks");
        all.add("Friends");
        all.add("Dear");
        all.add("Is");
        all.add("Superb");
        Collections.sort(all,Collections.reverseOrder());
        
        System.out.println("List after the use of" +
                " Collection.sort() :\n" + all);
        
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));
        
        
       // Collections.sort(ar,new Sortbyroll());
        
        // by using anonymous class technique 1
        Comparator<Student> comp = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {				
				return o1.rollno-o2.rollno;
			}
		};
        		
        		
        //Collections.sort(ar,comp);
        
		// by using anonymous class technique 2
        /*Collections.sort(ar,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {				
				return o1.rollno-o2.rollno;
			}
		});*/
        
		// by using Lamda
        /*Collections.sort(ar,(Student o1, Student o2)-> {							
				return o1.rollno-o2.rollno;			
		});*/
        
       // Collections.sort(ar,(Student o1, Student o2)->o1.name.compareTo(o2.name));
        // Double colon method
        Collections.sort(ar,Comparator.comparing(Student::getName).reversed());
        
        
        
        System.err.println(ar);
        
	}

}
