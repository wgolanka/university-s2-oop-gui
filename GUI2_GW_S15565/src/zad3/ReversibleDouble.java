package zad3;

public class ReversibleDouble implements Reversible
{
	double number;
	double reversed;
	Boolean isReversed = false;
	
	public ReversibleDouble(double number)
	{
		this.number = number;
		reversed = number;
	}

	@Override
	public Reversible reverse()
	{
		if(isReversed == false)
		{
			reversed = Math.pow(number, -1);
			isReversed = true;
			return this;		
		}
		else
		{
			reversed = number;
			reversed += 10;
			return this;
		}
	}
	
	public String toString()
	{
		return String.valueOf(reversed);
	}

}
