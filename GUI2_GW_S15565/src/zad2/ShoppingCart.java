package zad2;

import java.util.LinkedHashMap;

public class ShoppingCart
{
	Customer customer;
	LinkedHashMap<Flower, Double> insertFlower;
	
	public ShoppingCart()
	{
		insertFlower = new LinkedHashMap<Flower, Double>();
	}
	
	public String iter()
	{
		for (Flower key : insertFlower.keySet())
		{
			System.out.println(key);
		}
		return "";
	}
	
	public String toString()
	{
		return "Wózek "+ customer;
	}
}
