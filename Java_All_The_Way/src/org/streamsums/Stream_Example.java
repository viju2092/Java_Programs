package org.streamsums;

import java.util.*;
import java.util.stream.*;

public class Stream_Example {

	public static void main(String[] args) {

	Stream<Integer> intstream = Stream.of(1,2,3,4,5,6,7,8,9);
	intstream.forEach(p -> System.out.print(p + " "));
	
	System.out.println();
	
	Stream<String> strstream = Stream.of("Hi","How","are","you");
	strstream.forEach(w -> System.out.print(w + " "));
	
	List<Integer> values = new ArrayList<Integer>();
	for(int i=1;i<10;i++) {
		values.add(i);
	}
	
	System.out.println();
	Stream<Integer> strr = values.stream();
	strr.forEach(k -> System.out.print(k + " "));
	
	System.out.println();
	Stream<String> stream = Stream.of("A$B$C".split("\\$"));
    stream.forEach(z -> System.out.print(z + " "));
    
	}

}
