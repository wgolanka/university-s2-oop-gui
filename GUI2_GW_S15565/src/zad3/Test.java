package zad3;

public class Test
{

	public static void main(String[] args)
	{
		String str = "";
		char[] arr = {'a', 'l', 'a'};
		
		str = new String(arr);
		System.out.println(str);
		
		
		
		String word = "Kotek";
		
		System.out.println("==========" + "\n" +word);
		
		char[] arr1 = word .toCharArray();
		char tmp = ' ';
		for(int i = 0, j = arr1.length - 1; i < arr1.length / 2; i++, j--)
		{
			System.out.println(arr1[i]);
			System.out.println(arr1[j]);
			tmp = arr1[i];
			arr1[i] = arr1[j];
			arr1[j] = tmp;
		}
		word = new String(arr1);
		
		System.out.println(word);
		
		
	}
}
