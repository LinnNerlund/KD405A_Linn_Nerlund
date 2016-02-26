import java.util.ArrayList;

public class BikeStore {
	private  ArrayList<Bike> bikes = new ArrayList <Bike>();
	public String getAllBikes(){
		String s = "";
		for(Bike b : bikes){
			s = s + b.getColor() + b.getSize() + b.getPrice() + "\n";
			
		}
		
		return s;
		
	}
    public void addBike(String color, int size, int price){
    	bikes.add(new Bike(color, size, price)); 
    	
    }
}
