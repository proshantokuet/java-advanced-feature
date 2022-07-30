package com.proshanto.java.lamda;

import java.util.Comparator;

public class Sortbyroll implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {		
		return o1.rollno-o2.rollno;
	}

}
