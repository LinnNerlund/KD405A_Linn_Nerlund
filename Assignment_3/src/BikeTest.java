import java.util.ArrayList;

public class BikeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 ArrayList<Bike> myBikes = new ArrayList <Bike>();
			
         
		 myBikes.add(new Bike("black",20,15000));
		 myBikes.add(new Bike("white",1,10000));
		 myBikes.add(new Bike("green",8,29000));
		 myBikes.add(new Bike("blue",15,4000));
		 myBikes.add(new Bike("yellow",11,12000));
		 myBikes.add(new Bike("purple",13,18000));
		 myBikes.add(new Bike("pink",100,5000));
		 myBikes.add(new Bike("red",20,16000));
		 myBikes.add(new Bike("black",20,19000));
		 myBikes.add(new Bike("white",25,15000));
		 
		 for(int i = 0; i< myBikes.size(); i++){
				System.out.println("The bike has the color " + myBikes.get(i).getColor() + " and is " + myBikes.get(i).getSize() + " tum, the price is " +  myBikes.get(i).getPrice() + " kr");
			}
			
				}

		}