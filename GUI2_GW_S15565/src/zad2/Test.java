package zad2;

import java.util.Iterator;

public class Test
{
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{


	    PriceList pl = PriceList.getInstance();
	  
	    pl.put("róża", 10.0);
	    pl.put("bez", 12.0);
	    pl.put("piwonia", 8.0);
	    
//	    for (String key : pl.mapPrice.keySet()) //Price List in map, works
//	    {
//	    	System.out.println(key) ;
//	    }

	    Customer janek = new Customer("Janek", 200);


	    janek.get(new Rose(5));
	    janek.get(new Peony(5));
	    janek.get(new Freesia(3));
	    janek.get(new Lilac(3));

	  
	    ShoppingCart wozekJanka = janek.getShoppingCart();
	    System.out.println("Przed płaceniem " + wozekJanka);
	    Flower toRemove = null;
	    for(Flower flower : wozekJanka.insideShoppingCart.keySet())
		{
			if(flower.price == 0)
			{
//				wozekJanka.insertFlower.remove(flower);
				toRemove = flower;
			}
		}
		wozekJanka.insideShoppingCart.remove(toRemove);
	    System.out.println("\nPo" + wozekJanka);
	
	}
}
