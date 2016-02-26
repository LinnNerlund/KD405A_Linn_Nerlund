import java.util.Arrays;

public class Bike {
	private int price;
	private String color;
	private int size;
	     
	//Constructors
	/**skapar en Bike med färg och pris*/
	
	public Bike (String color, int price){
		this.color = color;
		this.price = price;
	}
	/**kollar om storlek, pris och färg stämmer. Gör om strl och pris till
	 * rätt om det inte stämmer och ger Bike ofärgad om färgen inte stämmer*/
	public Bike (String color, int size, int price){
		if (Arrays.asList(ConstansBike.COLORARRAY).contains(color)){
			this.color = color;
		}else{ 
			this.color = "unpainted";
		}
		
		if (size < ConstansBike.MIN_SIZE){
			this.size = ConstansBike.MIN_SIZE;
			}else if(size > ConstansBike.MAX_SIZE){
				this.size = ConstansBike.MAX_SIZE;
			}else{
				this.size = size;
						
			
		}
		if (price < ConstansBike.MIN_PRICE){
			this.price = ConstansBike.MIN_PRICE;
			}else if(price > ConstansBike.MAX_PRICE){
				this.price = ConstansBike.MAX_PRICE;
			}else{
				this.price = price;

	}
	}
	
	//Methods
	
	public String getColor(){
		return this.color;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public int getSize (){
		return this.size;
	}

}
