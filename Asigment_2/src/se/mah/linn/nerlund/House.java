package se.mah.linn.nerlund;

public class House {
	private int yearBuilt = 2015;
	private int minYearBuilt = 1800;
	private int size = 1000;
	private final int minSize = 10;
	
	

	public House(int _yearBuilt,int _size){
		
	 if(yearBuilt>minYearBuilt)

	{ 
		 this.yearBuilt = _yearBuilt;
	 }else

	{
		yearBuilt = minYearBuilt;
	} if(size>minSize)

	{
		this.size = _size;
	} else

	{
		this.size = minSize;

	}

}

	public int getYearBuilt(){
	 return this.yearBuilt;
	 }

	public int getSize() {
		return this.size;
	}

}

