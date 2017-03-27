/**
 *
 *  @author Golanka Wiktoria S15565
 *
 */

package zad2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finder 
{
String fname;
	
	public Finder(String fname)
	{
		this.fname = fname;
	}
	
	public int getIfCount()
	{
		return getSomethingCount("if", false);
	}
	
	public int getStringCount(String string)
	{
		return getSomethingCount(string, true);
	}
	
	int getSomethingCount(String word, boolean ignoreComments)
	{
		File file = new File(fname);
		
		int wordCount = 0;

		try
		{
			Scanner sc = new Scanner(file);
			
			boolean multiLineComment = false;
			
			while(sc.hasNextLine())
			{
				String line = sc.nextLine();
				String words[] = line.split("\\s");
				
				boolean singleLineComment = false;
				
				for(int i = 0; i < words.length; i++)
				{
					if(words[i].startsWith("//"))
					{
						singleLineComment = true;
					}
					
					if(words[i].startsWith("/*") && !multiLineComment
							|| words[i].contains("*/") && multiLineComment)
					{
						multiLineComment = !multiLineComment;
					}
					
					if((singleLineComment || multiLineComment) && !ignoreComments)
					{
						continue;
					}
					
					if(words[i].contains(word))
					{
						wordCount++;
					}
				}
			}
			sc.close();			
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}	
		return wordCount;
	}

}    
