/**
 *
 *  @author Golanka Wiktoria S15565
 *
 */

package zad3;


public class ReverseTest {

  public static void main(String[] args) {
  
        Reversible[] revers = new Reversible[] {
            new ReversibleString("Cat"),
            new ReversibleDouble(2),
            new ReversibleDouble(3),
            new ReversibleString("Dog"),
            new ReversibleString("She has dog and cat"),
            new ReversibleDouble(10),
        };

        System.out.println("Normally:");
        for (Reversible r : revers) {
          System.out.println(r);
        }

        for (Reversible r : revers) {
          r.reverse();
        }

        System.out.println("Reversed:");
        for (Reversible r : revers) {
          System.out.println(r);
        }

        System.out.println("Restored and changed");
        for (Reversible r : revers) {
        	System.out.println(r.reverse());
        }
      }
    }
