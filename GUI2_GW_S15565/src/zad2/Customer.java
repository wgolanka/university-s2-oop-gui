package zad2;

import java.util.LinkedHashMap;

public class Customer 
{
	String name;
	int money;
	ShoppingCart shoppingCart;

	public Customer(String name, int money)
	{
		this.name = name;
		this.money = money;
	}

	public ShoppingCart getShoppingCart()
	{
		if(shoppingCart == null)
			shoppingCart = new ShoppingCart();
		
		shoppingCart.customer = this;
		
		return shoppingCart;
	}
	
	public LinkedHashMap get(Flower flower)
	{
		if(shoppingCart == null)
			shoppingCart = new ShoppingCart();
		
		shoppingCart.insertFlower.put(flower, flower.amount);
		return shoppingCart.insertFlower;
	}

	public String getCash()
	{
		return String.valueOf(money);
	}

	public void pay()
	{
		// TODO Auto-generated method stub
		
	}

	public void pack(Box customerBox)
	{
		// TODO Auto-generated method stub
		
	}
	
	public String toString()
	{
		return "właściciel " + name;
	}

}
