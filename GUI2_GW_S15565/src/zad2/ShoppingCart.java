package zad2;

import java.util.LinkedHashMap;

public class ShoppingCart
{
	Customer customer;
	LinkedHashMap<Flower, Integer> inside;
	static String flowers;
	
	public ShoppingCart()
	{
		inside = new LinkedHashMap<Flower, Integer>();
	}

	public String showCart()
	{
		flowers = "";
		for (Flower key : inside.keySet())
		{
			flowers += key.toString() + "\n";
		}	
		return flowers;
	}
	
	public String toString()
	{
		if(inside.isEmpty())
			return " -- pusto";
		return "Wózek "+ customer + "\n" + showCart();
	}
}
