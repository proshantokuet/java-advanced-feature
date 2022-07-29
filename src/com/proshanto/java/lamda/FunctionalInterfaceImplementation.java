package com.proshanto.java.lamda;

public class FunctionalInterfaceImplementation {
	public static void main(String args[]) {
		// create anonymous inner class object		
		
		new Game(new Play() {
			
			@Override
			public void start() {
				System.err.println("game is starting .....");
				
			}
		}).run();
		
	}
	
	

}
