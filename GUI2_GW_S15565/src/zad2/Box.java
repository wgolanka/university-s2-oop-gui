package zad2;


public class Box extends Package
{
	
	public Box(Customer customer)
	{
		this.customer = customer;
	}
	
	public String toString()
	{
		return "Pudełko " + customer + "\n" + show(boxMap);
	}

}
