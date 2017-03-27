package zad2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testt
{

	public static void main(String[] args)
	{
		String line = "{	if (a > b) d = \"wariant\"; int pif; int piiif; int ifxxx; int ifc; if(a>b)if(c>d) x = 1;}";
		String words[] = line.split("\\s");
		
		
		for(int i = 0; i < words.length; i++)
		{
//			System.out.println(words[i]);
			if(words[i].matches("[A-Za-z]+if[A-Za-z]+") || words[i].matches(""))
			{
//				System.out.println("match " + words[i]);
			}
		}
		
		regexChecker(".?if",line);

	}
	
	public static void regexChecker(String theRegex, String str2Check)
	{
		Pattern checkRegex = Pattern.compile(theRegex);
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		int count = 0;
		while(regexMatcher.find())
		{
			count++;
			if(regexMatcher.group().length() != 0)
			{
				System.out.println(regexMatcher.group().trim());
			}
		}
		System.out.println("if counted: " + count);
	}
	
	

}
