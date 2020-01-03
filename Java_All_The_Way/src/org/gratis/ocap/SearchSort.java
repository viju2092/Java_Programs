package org.gratis.ocap;

import java.util.*;

public class SearchSort {

	public static void main(String[] args) {

	List<Integer> list = Arrays.asList(9,7,5,3);
	Collections.sort(list);
	System.out.println(Collections.binarySearch(list, 3));
	System.out.println(Collections.binarySearch(list, 2));
	
	List<Integer> nums = new ArrayList<Integer>();
	nums.add(1);
	nums.add(new Integer(3));
	nums.add(new Integer(5));
	nums.add(new Integer(7));
	nums.add(new Integer(8));
	nums.remove(1);
	System.out.println(nums.remove(new Integer(6)));
	System.out.println(nums);
	
	}

}
