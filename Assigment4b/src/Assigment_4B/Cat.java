package Assigment_4B;

public class Cat extends Mammal{
	
	private int numberOfLives;
	
	public Cat (String latinName, int gestationTime, int numberOfLives){
		super(latinName, gestationTime);
	    this.numberOfLives = numberOfLives;
	}
	
	public int getNumberOfLives(){
		return numberOfLives;
	}
	
	public void setNumberOfLives(int setNumberOfLives){
		this.numberOfLives = numberOfLives;
	}
	
	@Override
	public String getInfo(){
		return "A cat has the latin name " + getLatinName() + "nurses for " + getGestationTime() + " month and has " + getNumberOfLives() + " lives"; 
	}

}
