/**
 *
 *  @author Golanka Wiktoria S15565
 *
 */

package zad4;


public class Main {
  public static void main(String[] args)
  {
    Spiewak s1 = new Spiewak("Carrey"){

		@Override
		String sing()
		{
			return "oooooooooooo";
		}
    };

    Spiewak s2 = new Spiewak("Houston"){

		@Override
		String sing()
		{
			return "a4iBBiii";
		}
    };

    Spiewak s3 = new Spiewak("Madonna"){

		@Override
		String sing()
		{
			return "aAa";
		}
    };

    Spiewak sp[] = {s1, s2, s3};

    for (Spiewak s : sp)
      System.out.println(s);


    System.out.println("\n" + Spiewak.najglosniej(sp));
  }
}
