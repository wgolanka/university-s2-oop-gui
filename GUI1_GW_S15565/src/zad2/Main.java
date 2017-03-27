/**
 *
 *  @author Golanka Wiktoria S15565
 *
 */

package zad2;

/*
 * That one isn't finished, I only got 1/6 points.
 */

public class Main {

  public static void main(String ... args) throws Exception  {
    String fname  = System.getProperty("user.home")+"/Test.java";
    Finder finder = new Finder(fname);
    int nif = finder.getIfCount();
    int nwar = finder.getStringCount("wariant");
    System.out.println("Liczba instrukcji if: " + nif);
    System.out.println("Liczba napisow wariant: " + nwar);
  }

}
