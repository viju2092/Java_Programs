package my.school;

public class ExecuteTest {

	static int total = 10;
	
	public static void main(String args[])
	{
	  new ExecuteTest();	
	}

	public ExecuteTest() {
		System.out.println("Executing Test");
		System.out.println(this);
		int temp = this.total;
		if(temp > 5)
		{
			System.out.println(temp);
		}
	}

}
