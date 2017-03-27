/**
 *
 *  @author Golanka Wiktoria S15565
 *
 */

package zad4;


import java.io.*;
import java.util.*;


public class CountWords
{
	String fname;
	List<String> list;
	LinkedHashMap<String, Integer> map;
	
	public CountWords(String fname)
	{
		this.fname = fname;
	}
	
	public List<String> getResult()
	{		
		LinkedHashMap<String, Integer> map = this.getMap();
		List<String> list = this.list;	
		String[] arrayOfWords = listToArray(list);
		getWordsCount(map, arrayOfWords);
		
		return this.connect();
	}
	
	public LinkedHashMap<String, Integer> getMap()
	{
		List<String> list = new ArrayList<String>();
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		FileReader fr = null;
		StreamTokenizer sT;
		
		try
		{
			fr = new FileReader(this.fname);
			sT = new StreamTokenizer(fr);
			
			while(sT.nextToken() != StreamTokenizer.TT_EOF)
			{
			    if(sT.ttype == StreamTokenizer.TT_WORD) 
			    {
			    	map.put(sT.sval, 0);
				    list.add(sT.sval);
			    }
			}
		} catch (IOException e)
		{
			
		}
		this.list = list;
		this.map = map;
		return map;
	}
	
	public static String[] listToArray(List<String> list)
	{
		String[] arrayOfWords = new String[list.size()];
		arrayOfWords = list.toArray(arrayOfWords);
		return arrayOfWords;
	}
	
	public static int[] listToValArray(Object[] obj, int[] array) 
	{
		for(int i = 0; i < obj.length; i++)
		{
			array[i] = (int) obj[i];
		}
		return array;
	}
	
	public static LinkedHashMap<String, Integer> getWordsCount(
			LinkedHashMap<String, Integer> map, String[] arrayOfWords)
	{
		for(int i = 0; i < arrayOfWords.length; i++)
		{
			int repeat = map.get(arrayOfWords[i]);
			map.put(arrayOfWords[i], ++repeat);
		}
		return map;
	}
	
	public List<String> connect()
	{
		List<String> listKey = new ArrayList<String>(map.keySet());
		List<Integer> listVal= new ArrayList<Integer>(map.values());
		
		Object[] obj = listVal.toArray();
		String[] arrKey = listToArray(listKey);
		int[] arrVal = new int[arrKey.length];
		arrVal = listToValArray(obj, arrVal);
		
		List<String> listFinal = new ArrayList<String>();
		
		for(int i = 0; i < arrKey.length; i++)
		{
			listFinal.add(arrKey[i] + " " + String.valueOf(arrVal[i]));
		}
		return listFinal;
	}
}