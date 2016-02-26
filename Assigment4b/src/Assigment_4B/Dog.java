package Assigment_4B;

public class Dog extends Mammal {
	private boolean stupid;
	public Dog (String latinName, int gestationTime, boolean stupid){
		super(latinName, gestationTime);
		this.stupid = stupid;
	}
	
	public Dog (String latinName, int gestationTime, boolean stupid, String friendlyName){
		super(latinName, gestationTime);
		this.stupid = stupid;
		setFriendlyName(friendlyName);
		
	}
	
	public boolean isStupid(){
		return stupid;
	}
	
	@Override
	public String getInfo(){
		if (isStupid() == true){
			return("the dog " + getFriendlyName() + " has the latin name " + getLatinName()+ ", nurses for " + getGestationTime() + " month and is stupid ");
		}else{
			return("the dog " + getFriendlyName() + " has the latin name " + getLatinName()+ ", nurses for " + getGestationTime() + " month and is clever ");
			
		}
		
	}

}
