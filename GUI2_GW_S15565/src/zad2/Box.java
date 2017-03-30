package zad2;

import java.util.LinkedHashMap;

public class Box
{
	Customer customer;
	LinkedHashMap<Flower, String> boxMap;
	static String flowers;

	public Box(Customer customer)
	{
		this.customer = customer;
		boxMap = new LinkedHashMap<Flower, String>();
	}
	
	public String showBox()
	{
		flowers = "";
		for (Flower key : boxMap.keySet())
		{
			flowers += key.toString() + "\n";
		}	
		return flowers;
	}
	
	public String toString()
	{
		return "Pudełko " + customer + "\n" + showBox();
	}

}
