package zad2;

import java.util.LinkedHashMap;

public class Package
{
	Customer customer;
	LinkedHashMap<Flower, Integer> 
			insideShoppingCart = new LinkedHashMap<Flower, Integer>(),
			boxMap = new LinkedHashMap<Flower, Integer>();
	static String flowerDescription;
	
	public String show(LinkedHashMap<Flower, Integer> map)
	{
		flowerDescription = "";
		for (Flower key : map.keySet())
		{
			flowerDescription += key.toString() + "\n";
		}	
		return flowerDescription;
	}

}
