package com.proshanto.java.lamda;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PredicateExample1 {
	
	public static void main(String[] args) {
		IntPredicate odd= (int a)->a%2==1;
		
		System.err.println(odd.test(2));
		
		IntStream intStream= IntStream.range(1, 9999);
		//System.err.println(intStream.boxed().collect(Collectors.toList()));
		IntPredicate less= (int i)-> i>2000;
		
		List<Integer> intList= intStream.filter(odd.and(less))
		.boxed().collect(Collectors.toList());
		
		System.err.println(intList);
		
		
	}

}
