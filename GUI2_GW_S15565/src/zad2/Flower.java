package zad2;

abstract class Flower
{
	String name;
	String colour;
	int amount;
	double price = -1;
	
	abstract String getName();
	abstract String getColour();
	
	public Flower()
	{
		name = getName();
		colour = getColour();
		price = getPrice();
	}
	
	double getPrice()
	{
		PriceList priceList = PriceList.getInstance();
		if(priceList.mapPrice.containsKey(name))
		{
			price = priceList.mapPrice.get(name);
		}
		return price;
	}
	
	public String toString()
	{
		return name + ", kolor: " + colour + ", ilość " + amount + ", cena " + getPrice();
	}
}
