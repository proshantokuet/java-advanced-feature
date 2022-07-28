package com.proshanto.java.anonymous;

/**
 * Annonymous class is a inner class without a name
 * A nested class without name is called anonymous class.
 * 
 *  It is an inner class without a name and for which only a single object is created.
 *  Difference between regular class(normal classes) and Anonymous Inner class:
 *   1. A normal class can implement any number of interfaces but the anonymous inner class can implement only one interface at a time.
 *   2. A regular class can extend a class and implement any number of interfaces simultaneously. But anonymous Inner class can extend a class or can implement an interface but not both at a time.
 *   3. For regular/normal class, we can write any number of constructors but we can’t write any constructor for anonymous Inner class because the anonymous class does not have any name and while defining constructor
 *   class name and constructor name must be same.
 * */
public class AnonymousTest {

	public static void main(String[] args) {
		Anonymous anonymous=new Anonymous() {
			
			@Override
			public void sum(int x, int y) {
				System.err.println(x+y);
				
			}
			
			@Override
			public void show() {
				System.err.println("default message...");
				
			}
		};

		anonymous.show();
		anonymous.sum(23, 43);
	}

}
