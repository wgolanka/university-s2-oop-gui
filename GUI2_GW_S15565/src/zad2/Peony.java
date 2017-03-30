package zad2;

public class Peony extends Flower
{

	public Peony(int amount)
	{
		super();
		this.amount = amount;
	}

	@Override
	String getName()
	{
		return "piwonia";
	}

	@Override
	String getColour()
	{
		return "czerwony";
	}

}
