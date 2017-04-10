package zad2;

abstract class Flower
{
	String name;
	String colour;
	int amount;
	double price = -1;

	public Flower()
	{
		name = getName();
		colour = getColour();
		price = getPrice();
	}
	
	abstract String getName();
	abstract String getColour();
	
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
		return name + ", colour: " + colour + ", amount " + amount + ", price " + price;
	}
}
