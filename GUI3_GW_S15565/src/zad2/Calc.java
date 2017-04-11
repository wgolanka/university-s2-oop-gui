/**
 *
 *  @author Golanka Wiktoria S15565
 *
 */

package zad2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;

public class Calc 
{
	BigDecimal numA;
	BigDecimal numB;
	HashMap<String, BigMath> map;
	
	interface BigMath
	{
		BigDecimal operation(BigDecimal a, BigDecimal b);
	}

	public String doCalc(String string)
	{
		String[] array = string.split("\\s+");
		map = new HashMap<String, BigMath>();
		
		try
		{
			numA = new BigDecimal(Integer.valueOf(array[0]));
			numB = new BigDecimal(Integer.valueOf(array[2]));	
			String operator = array[1];
			
			System.out.println("number A: " + numA);
			System.out.println("Operator: " + operator);
			System.out.println("number B: " + numB);
			
			BigMath addition = (numA, numB) -> numA.add(numB, MathContext.DECIMAL32);		
			BigMath substraction = (numA, numB) -> numA.subtract(numB, MathContext.DECIMAL32);
			BigMath multiply = (numA, numB) -> numA.multiply(numB, MathContext.DECIMAL32);
			BigMath divide = (numA, numB) -> numA.divide(numB, MathContext.DECIMAL32);
		 	
			map.put("+", addition);
			map.put("-", substraction);
			map.put("*", multiply);
			map.put("/", divide);
			
			return String.valueOf(map.get(operator).operation(numA, numB));
		
		}catch(Exception e)
		{
			e.printStackTrace();
			return "Invalid command to calc";
		}			
	}
}  
