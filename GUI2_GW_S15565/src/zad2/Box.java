package zad2;


public class Box extends Package
{
	
	public Box(Customer customer)
	{
		this.customer = customer;
	}
	
	public String toString()
	{
		return "Box " + customer + "\n" + show(boxMap);
	}

}
