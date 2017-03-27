package zad2;

abstract class Flower
{
	String name;
	String colour;
	double amount;
	double price;
	
	
	public String toString()
	{
		return name + ", kolor: " + colour + ", ilość " + amount + ", cena " + price;
	}
}
