package zad2;

import java.util.LinkedHashMap;

public class ShoppingCart
{
	Customer customer;
	LinkedHashMap<Flower, Integer> insideShoppingCart;
	static String flowers;
	
	public ShoppingCart()
	{
		insideShoppingCart = new LinkedHashMap<Flower, Integer>();
	}

	public String showCart()
	{
		flowers = "";
		for (Flower key : insideShoppingCart.keySet())
		{
			flowers += key.toString() + "\n";
		}	
		return flowers;
	}
	
	public String toString()
	{
		if(insideShoppingCart.isEmpty())
			return " -- pusto";
		return "Wózek "+ customer + "\n" + showCart();
	}
}
