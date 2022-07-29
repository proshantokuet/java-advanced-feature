package com.proshanto.java.lamda;

import java.util.function.LongConsumer;

public class LongConsumerExample {
	public static void main(String args[])
    {
  
        // Create a LongConsimer Instance
        LongConsumer
            display
            = a -> System.out.println(a * 40);
        LongConsumer mul =(a)->System.err.println(a);
  
        // Using addThen() method
        LongConsumer composite = mul.andThen(display).andThen(display);
        
        composite.accept(3);
    }

}
