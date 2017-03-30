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
		return "Frezja";
	}

	@Override
	String getColour()
	{
		return "żółty";
	}
}
