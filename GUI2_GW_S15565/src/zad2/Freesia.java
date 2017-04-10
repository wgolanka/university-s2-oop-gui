package zad2;

public class Freesia extends Flower
{
	public Freesia(int amount)
	{
		super();
		this.amount = amount;
	}

	@Override
	String getName()
	{
		return "Freesia";
	}

	@Override
	String getColour()
	{
		return "yellow";
	}
}
