package zad3;

public class ReversibleString implements Reversible
{
	String reversed;
	String word;
	boolean isReversed = false;

	public ReversibleString(String word)
	{
		this.word = word;
		reversed = word;
	}

	public Reversible reverse()
	{
		reversed = word;
		if(isReversed == false)
		{
			char[] arr = reversed.toCharArray();
			char tmp = ' ';
			for(int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--)
			{
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
			reversed = new String(arr);
			isReversed = true; 
			return this;
		}
		else
		{
			reversed = "Tekst " + word;
			return this;
		}
	}

	public String toString()
	{
		return reversed;
	}

}
