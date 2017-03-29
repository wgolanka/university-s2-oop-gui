/**
 *
 *  @author Golanka Wiktoria S15565
 *
 */

package zad4;


public abstract class Spiewak 
{
	String surname;
	int id;
	static int addNextID = 1;

	public Spiewak(String surname)
	{
		this.surname = surname;
		id = addNextID;
		addNextID++;
	}
	
	abstract String sing();

	public static Spiewak najglosniej(Spiewak[] sp)
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
