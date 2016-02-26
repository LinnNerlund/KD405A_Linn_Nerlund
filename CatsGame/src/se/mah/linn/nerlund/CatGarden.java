package se.mah.linn.nerlund;

public class CatGarden {
	private ArrayList;
	private String name;
	
	public CatGarden(String name){
		allCats =new ArrayList<Cat>();
		this.name =name;
		
	}
	
public void addCat (Cat c){
	if (allCats.size()<101){
		
	}
}
public void killCat(){
	allCats.remove(0);
}

public String getCats(){
	String s = this.name+"\n";
	for(Cat cat : allCats) {
		s=s + cat.getName() +"\n";
	}
	
	return s;
	
}

}
