/**
 *
 *  @author Golanka Wiktoria S15565
 *
 */

package zad4;


public abstract class Singer 
{
	String surname;
	int id;
	static int nextID = 1;

	public Singer(String surname)
	{
		this.surname = surname;
		id = nextID;
		nextID++;
	}
	
	abstract String sing();

	public static Singer loudest(Singer[] sp)
	{		
		int loudest = 0, volume = 0, singer = 0;
		
		for(int i = 0; i < sp.length; i++)
		{
			String song = sp[i].sing();
			char[] array = song.toCharArray();
			
			for(int j = 0; j < array.length; j++)
			{
				if(Character.isUpperCase(array[j]))
				{
					volume++;
				}
			}
			
			if(volume > loudest)
			{
				loudest = volume;
				singer = i;
			}
			volume = 0;
		}
		return sp[singer];
	}
	
	public String toString()
	{
		return "(" + id + ") " + surname + ": " + sing();
	}
}
