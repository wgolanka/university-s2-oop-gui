package zad2;

import java.util.LinkedHashMap;

public class PriceList 
{
	private static PriceList instance = null;
	LinkedHashMap<String, Double> mapPrice;
	protected PriceList(){}
	
	public static PriceList getInstance()
	{
		if(instance == null)
			instance = new PriceList();
		
		return instance;
	}

	@SuppressWarnings("rawtypes")
	public LinkedHashMap put(String flower, double price)
	{
		if(instance.mapPrice == null)
			instance.mapPrice = new LinkedHashMap<String, Double>();
		
		instance.mapPrice.put(flower, price);
		return instance.mapPrice;
	}

}
