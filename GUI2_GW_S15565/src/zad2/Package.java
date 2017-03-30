package zad2;

import java.util.LinkedHashMap;

public class Package
{
	Customer customer;
	LinkedHashMap<Flower, Integer> 
	insideShoppingCart = 
			new LinkedHashMap<Flower, Integer>(),
			boxMap = 
				new LinkedHashMap<Flower, Integer>();
	static String flowers;
	
	public String show(LinkedHashMap<Flower, Integer> map)
	{
		flowers = "";
		for (Flower key : map.keySet())
		{
			flowers += key.toString() + "\n";
		}	
		return flowers;
	}

}
