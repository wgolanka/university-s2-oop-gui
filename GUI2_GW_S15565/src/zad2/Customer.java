package zad2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Customer 
{
	String name;
	double money;
	ShoppingCart shoppingCart;
	final PriceList priceList = PriceList.getInstance();
	
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
	
	@SuppressWarnings("rawtypes")
	public LinkedHashMap get(Flower flower)
	{
		if(shoppingCart == null)
			shoppingCart = new ShoppingCart();
		
		shoppingCart.insideShoppingCart.put(flower, flower.amount);
		return shoppingCart.insideShoppingCart;
	}

	public String getCash()
	{
		return String.valueOf(money);
	}

	public void pay()
	{
		deleteUnpriced();
		money -= getSum();
	}
	
	public double getSum()
	{
		double sum = 0.0;
		double affordable = 0.0;
		for(Flower flower : shoppingCart.insideShoppingCart.keySet())
		{
			sum += flower.amount * flower.price;
			if(sum > money)
			{
				deleteUnpriced(flower);
			}
			else
			{
				affordable = sum;
			}
		}
		return affordable;
	}
	
	public ShoppingCart deleteUnpriced()
	{
		List<Flower> toRemove = new ArrayList<Flower>();
		for(Flower flower : shoppingCart.insideShoppingCart.keySet())
		{
			if(!priceList.mapPrice.containsKey(flower.name))
			{
				toRemove.add(flower);
			}
		}	
		for(Flower flower : toRemove)
		{
			shoppingCart.insideShoppingCart.remove(flower);
		}
		
		return shoppingCart;	
	}
	
	public ShoppingCart deleteUnpriced(Flower flowerToRemove)
	{
		shoppingCart.insideShoppingCart.remove(flowerToRemove);
		return shoppingCart;	
	}

	
	public void pack(Box customerBox)
	{
		customerBox.customer = this;
		
		for(Flower flower : shoppingCart.insideShoppingCart.keySet())
		{
			customerBox.boxMap.put(flower, flower.colour);
		}
		
		shoppingCart.insideShoppingCart.clear();		
	}
	
	public String toString()
	{
		return "właściciel " + name;
	}

}
