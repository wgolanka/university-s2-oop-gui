package zad1;

public class RunnyNose extends Patient 
{

	public RunnyNose(String surname) 
	{
		super(surname);
	}
	
	@Override
	public String disease()
	{
		return "runny nose";
	}
	
	@Override
	public String treatment()
	{
		return "tissues";
	}

}
