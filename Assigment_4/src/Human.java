
public class Human {
	private Dog dog;
	private String name;
	
	public Human (String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}

	public void buyDog(Dog dog){
		this.dog = dog;
	}
	
	public String getInfo(){
		if (dog != null){
			return this.getName() + " ones " + this.dog.getName().toString(); 
		
		}else{
			return this.getName() + " does not own a dog ";
		}
	}
}
