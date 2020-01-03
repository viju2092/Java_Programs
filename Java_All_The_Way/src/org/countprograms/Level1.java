package org.countprograms;

public class Level1 {

	private int x = 10;
	class Level2 {
		private int x = 20;
	class Level3 {
		private int x = 30;
		public void allTheX() {
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Level2.this.x);
			System.out.println(Level1.this.x);
		}
	}
	}	
	public static void main(String args[]) {
	
		Level1 l1 = new Level1();
		Level2 l2 = l1.new Level2();
		Level1.Level2.Level3 l3 = l2.new Level3();
		l3.allTheX();
	}
}
