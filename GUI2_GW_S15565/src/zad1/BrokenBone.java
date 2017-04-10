package zad1;

public class BrokenBone extends Patient
{

	public BrokenBone(String surname) 
	{
		super(surname);
	}
	
	@Override
	public String disease()
	{
		return "broken leg";
	}
	
	@Override
	public String treatment()
	{
		return "gypsum";
	}

}
