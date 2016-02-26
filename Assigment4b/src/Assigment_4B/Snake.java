package Assigment_4B;

public class Snake extends Animal {
	
	private boolean poisonus;
	
	public Snake (String latinName, boolean poisonus){
		super (latinName);
		this.poisonus = poisonus;
	}
	
	public boolean isPoisonus(){
		return poisonus;
	}

	@Override
	public String getInfo(){
		if (isPoisonus() == true){
			return ( "I am a snake with the latin name " + getLatinName() + " and I am poisonus");
		}else{
			
			return ( "I am a snake with the latin name " + getLatinName() + " and I am not poisonus");
			
		}
		
	}
}
