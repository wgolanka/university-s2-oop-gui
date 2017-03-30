package zad2;

public class Rose extends Flower
{

	public Rose(int amount)
	{
		super();
		this.amount = amount;
	}

	@Override
	String getName()
	{
		return "róża";
	}

	@Override
	String getColour()
	{
		return "czerwony";
	}

}
