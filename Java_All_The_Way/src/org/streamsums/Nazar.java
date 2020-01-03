package org.streamsums;

public class Nazar {

	int puzzel(int n) {

	int result;

	 if (n==1)
	 return 1;
	 result = puzzel(n-1) * n;
	 return result;
	}
	
}