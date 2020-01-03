package my.school;

public class Pennsylvania extends Michigan {

	String statecolor;
	int area;
	
	Pennsylvania(String statecolor,int area) {
		super(statecolor,area);
		//this.area = area;
	}
	
	public static void main(String args[]) {

		Michigan mi = new Michigan("Green",1211);
		United_States pen = new Pennsylvania("Blue",4500);
		pen.getColor();
		//pen.getarea();
		
		System.out.println();
		mi.getColor();
		mi.getarea();
		
	}
}
