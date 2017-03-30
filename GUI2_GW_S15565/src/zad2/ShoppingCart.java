package zad2;


public class ShoppingCart extends Package
{
	
	public String toString()
	{
		if(insideShoppingCart.isEmpty())
			return " -- pusto";
		
		return "Wózek "+ customer + "\n" + show(insideShoppingCart);
	}
}
