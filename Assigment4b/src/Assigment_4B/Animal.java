package Assigment_4B;

public abstract class Animal {

	private String latinName;
	private String friendlyName;
	
    public Animal (String latinName){
    	this.latinName = latinName;
    }
    
    public abstract String getInfo();
    
	public void setFriendlyName(String name){
		this.friendlyName = name;
	}
	
	public String getFriendlyName(){
		return this.friendlyName;
		
	}
	
	public void setLatinName(String name){
		this.latinName = name;
	}
    public String getLatinName(){
    	return this.latinName;
    }
}


