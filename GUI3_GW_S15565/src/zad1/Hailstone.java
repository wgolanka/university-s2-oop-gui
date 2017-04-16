package zad1;

import java.util.Iterator;

public class Hailstone implements Iterable<Integer>
{
	int start;
	int next;
	int previousNext;
	
	public Hailstone(int ini)
	{
		start = ini;
	}

	@Override
	public Iterator<Integer> iterator()
	{	
		return new Iterator<Integer>()
		{
			@Override
			public boolean hasNext()
			{	
				if(start <= 1) return false;
				return !(previousNext == 1 && next > previousNext);
			}

			@Override
			public Integer next()
			{	
				if(next == 0) next = start;	
				previousNext = next;
				
				if(next % 2 == 0)
				{
					next = next /2;
				}
				else
				{
					next = (3 * next) + 1;	
				}
				
				return next;
			}		
		};
	}
}
