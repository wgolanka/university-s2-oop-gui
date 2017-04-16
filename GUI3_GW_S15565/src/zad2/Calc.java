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
	HashMap<String, Operator> map;

	public String doCalc(String string)
	{
		String[] array = string.split("\\s+");
		map = new HashMap<String, Operator>();
		
		try
		{	
			numA = new BigDecimal(Double.valueOf(array[0]));
			numB = new BigDecimal(Double.valueOf(array[2]));	
			String operator = array[1];
			
			Operator addition = (numA, numB) -> numA.add(numB, MathContext.DECIMAL32);		
			Operator substraction = (numA, numB) -> numA.subtract(numB, MathContext.DECIMAL32);
			Operator multiplication = (numA, numB) -> numA.multiply(numB, MathContext.DECIMAL32);
			Operator division = (numA, numB) -> numA.divide(numB, MathContext.DECIMAL32);
		 	
			map.put("+", addition);
			map.put("-", substraction);
			map.put("*", multiplication);
			map.put("/", division);
			
			return String.valueOf(map.get(operator).operation(numA, numB));
		
		}catch(Exception e)
		{
			e.printStackTrace();
			return "Invalid command to calc";
		}			
	}
}  
