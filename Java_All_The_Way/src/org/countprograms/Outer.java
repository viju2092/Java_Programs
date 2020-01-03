package org.countprograms;

public class Outer {

	private String greeting = "Hi";
	
	protected class Inner {
		public int repeat = 3;
		public void go() {
			for(int i=0;i<=repeat;i++) {
				System.out.print(greeting + " ");
			}
		}
	}
	
	public static void main(String[] args) {
    
		Outer out = new Outer();
		Inner inn = out.new Inner();
		inn.go();
		
	}

}
