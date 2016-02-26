
public class TestBikeStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BikeStore bikeStore = new BikeStore();
		bikeStore.addBike("red", 20, 1000);
		bikeStore.addBike("blue", 2, 100);
		bikeStore.addBike("green", 25, 1500);
		
		System.out.println(bikeStore.getAllBikes());
	}

}
