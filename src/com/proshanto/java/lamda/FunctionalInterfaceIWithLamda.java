package com.proshanto.java.lamda;

public class FunctionalInterfaceIWithLamda {
	public static void main(String args[]) {
		// create anonymous inner class object		
		
		new Game(() ->{ System.err.println("game is starting .....");}).run();
		
	}
	
	

}
