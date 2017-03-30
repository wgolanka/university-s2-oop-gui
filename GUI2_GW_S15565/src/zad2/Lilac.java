package zad2;

public class Lilac extends Flower
{
	public Lilac(int amount)
	{
		super();
		this.amount = amount;
	}

	@Override
	String getName()
	{
		return "bez";
	}

	@Override
	String getColour()
	{
		return "biały";
	}

}
