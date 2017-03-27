/**
 *
 *  @author Golanka Wiktoria S15565
 *
 */

package zad3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import javax.management.modelmbean.InvalidTargetObjectTypeException;

public class Main
{	
	public static int[] listToIntArray(Object[] obj, int[] array)
	{
		for(int i = 0; i < obj.length; i++)
		{
			array[i] = (int) obj[i];
		}
		return array;
	}
	
	public static int findMaxValue(int[] array)
	{
		if(array.length == 0)
			return 0;
		
		int maxValue = array[0];
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] > maxValue)
			{
				maxValue = array[i];
			}
		}
		return maxValue;
	}
	
	public static void findIndexOfMaxValue(int[] array)
	{
		int maxValue = findMaxValue(array);
		
		if(array.length != 0)
		System.out.println("\n" + maxValue);
		
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == maxValue)
			{
				System.out.print(i + " ");
			}
		}		
	}
	
	public static void showArray(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
	public static boolean checkData(File file)
	{
		boolean correctInput = true;
		try
		{
			Scanner scanner = new Scanner(file);

			while(scanner.hasNext())
			{
				scanner.nextInt();
			}
			scanner.close();
			
		}catch(Exception e)
		{
			return correctInput = false;
		}
		return correctInput;
	}
	
	public static int[] getArray(File file)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Object[] obj;
		
		boolean correctData = checkData(file);
		
		try
		{
			Scanner scanner = new Scanner(file);

			while(scanner.hasNext())
			{	
				if(correctData == true)
					list.add(scanner.nextInt());
				else
					scanner.nextInt();
			}
			scanner.close();
			
		}catch(Exception e)
		{
			System.out.println("***");
		}
		
		obj = list.toArray();
		int[] array = new int[obj.length];
		listToIntArray(obj, array);
		
		return array;
	}
	
	public static void main(String[] args) 
	{
		String fname = System.getProperty("user.home") + "/tab.txt";
		File file = new File(fname);			
		int[] array = getArray(file);

		showArray(array);	
		findIndexOfMaxValue(array);
	}
}