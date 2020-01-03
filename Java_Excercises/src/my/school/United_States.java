package my.school;

public class United_States {

	String stateName;
	String statecolor;
	
	/*
	United_States() {
		System.out.println("Great US!!!!!");
	}
    */
	United_States(String statecolor) {
		this.statecolor = statecolor;
	}
	
	public void numberofstates() {
		System.out.println("The of states are 50!!!!!");
	}
	
	public void getColor() {
		System.out.println("The name of the state color is " + statecolor);
	}
	
}
