package org.objectreference;

public class Magic {

	private  String attribute;
	 
	
	  public Magic(String a) { 
		this.attribute = a;   
	  }
	 
    
    public String getAttribute() {
        return attribute;
    }
    
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}
