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
		return "peony";
	}

	@Override
	String getColour()
	{
		return "red";
	}

}
