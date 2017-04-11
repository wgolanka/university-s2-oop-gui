package zad1;

import java.util.Iterator;

public class Hailstone implements Iterable<Integer>
{
	int start;
	int next = 0;
	boolean trueOne = true;
	boolean falseOne = false;
	
	public Hailstone(int ini)
	{
		if(ini > 1)	start = ini;
	}

	@Override
	public Iterator<Integer> iterator()
	{	
		return new Iterator<Integer>()
		{
			@Override
			public boolean hasNext()
			{	
				return !falseOne;
			}

			@Override
			public Integer next()
			{	
				if(next == 0) next = start;	
				if(next % 2 == 0)
				{
					next = next /2;
				}
				else
				{
					next = (3 * next) + 1;	
				}
				
				if(trueOne == false) falseOne = true;
				if(next == 1) trueOne = false;
				
				return next;
			}		
		};
	}

}
