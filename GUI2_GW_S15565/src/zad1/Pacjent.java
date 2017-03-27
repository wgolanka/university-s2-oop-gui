package zad1;

public abstract class Pacjent 
{
	String nazwisko;
	String choroba;
	String leczenie;;
	
	public Pacjent(String nazwisko) 
	{
		this.nazwisko = nazwisko;
	}
	
	public String nazwisko()
	{
		return nazwisko;
	}
	
	abstract String choroba();	
	abstract String leczenie();
}
