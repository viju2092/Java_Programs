package my.school;

public class Michigan extends United_States {

	int area = 2345;
	
	Michigan(String statecolor, int area) {
	    super(statecolor);
	    //this.area = area;
	    area = this.area;
	}
	
	public void getarea() {
		System.out.println("The area of the state is " + area); 
	}
}
