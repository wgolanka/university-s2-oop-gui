package zad2;


public class ShoppingCart extends Package
{
	
	public String toString()
	{
		if(insideShoppingCart.isEmpty())
			return " -- empty";
		
		return "Cart "+ customer + "\n" + show(insideShoppingCart);
	}
	
}
