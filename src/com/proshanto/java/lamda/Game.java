package com.proshanto.java.lamda;

public class Game {
	private Play play;
	
	public Game(Play play){
		this.play=play;
	}
	
	public void run(){
		play.start();
		System.err.println("Running...");
	}

}
