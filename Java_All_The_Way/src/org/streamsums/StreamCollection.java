package org.streamsums;

import java.util.*;
import java.util.stream.*;

public class StreamCollection {

	public static void main(String[] args) {

	List<Integer> intvalues = new ArrayList<>();
	intvalues.add(3);
	intvalues.add(13);
	intvalues.add(-3);
	intvalues.add(1);
	intvalues.add(87);
	intvalues.add(22);
	intvalues.add(24);
	intvalues.add(6);
	intvalues.add(4);
	
	
	
	Stream<Integer> streamvalues = intvalues.stream();
	List<Integer> newevenintvalues = streamvalues.filter(m -> m%2 == 0).collect(Collectors.toList());
	System.out.println(newevenintvalues);
	
	List<String> strvalues = new ArrayList<>();
	strvalues.add("Vijay");
	strvalues.add("Ajay");
	strvalues.add("Vignesh");
	strvalues.add("Sanjay");
	strvalues.add("Varun");
	strvalues.add("Rohit");
	strvalues.add("Raina");
	strvalues.add("Virat");	
	
	boolean numcontain = strvalues.stream().anyMatch(s -> s.contains("Raina"));
	System.out.println(numcontain);
	
	long countR = strvalues.stream().filter(b -> b.startsWith("R")).count();
	System.out.println(countR);
	
	String firstR = strvalues.stream().filter(n -> n.startsWith("V")).findFirst().get();
	System.out.println(firstR);
	
	}

}
