package zad1;

public class Cold extends Patient 
{

	public Cold(String surname) 
	{
		super(surname);
	}
	
	@Override
	public String disease()
	{
		return "fever";
	}
	
	@Override
	public String treatment()
	{
		return "relax";
	}

}
