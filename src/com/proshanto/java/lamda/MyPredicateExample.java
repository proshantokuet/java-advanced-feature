package com.proshanto.java.lamda;

public class MyPredicateExample {
	
	public static void main(String[] args) {
		MyPredicate predicate =(x)->{
			if(x<12){
				return true;
			}else{
				return false;
			}
		};
		System.err.println(predicate.test(3));
	}

}
