package zad1;

public abstract class Patient 
{
	String surname;
	
	public Patient(String surname) 
	{
		this.surname = surname;
	}
	
	public String surname()
	{
		return surname;
	}
	
	abstract String disease();	
	abstract String treatment();
}
