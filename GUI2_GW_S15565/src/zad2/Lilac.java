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
		return "lilac";
	}

	@Override
	String getColour()
	{
		return "white";
	}

}
