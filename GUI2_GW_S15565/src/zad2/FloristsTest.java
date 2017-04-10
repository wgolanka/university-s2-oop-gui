/**
 *
 *  @author Golanka Wiktoria S15565
 *
 */

package zad2;


public class FloristsTest {
  // definicja metody sumowania wartosci kwiatów o podanym kolorze 
  static int valueOf(Box box, String color) {
     
	  int sum = 0;
	  
	  for(Flower flower : box.boxMap.keySet())
	  {
		  if(flower.colour.equals(color))
		  {
			  sum += flower.price * flower.amount;
		  }
	  }
	  return sum;
  }

  public static void main(String[] args) {
    // Kwiaciarnia samoobsługowa
    // ustalenie cennika
    PriceList pl = PriceList.getInstance();
    pl.put("rose", 10.0);
    pl.put("lilac", 12.0);
    pl.put("peony", 8.0);

    // Przychodzi klient janek. Ma 200 zł
    Customer john = new Customer("John", 200);

    // Bierze różne kwiaty: 5 róż, 5 piwonii, 3 frezje, 3 bzy
    john.get(new Rose(5));
    john.get(new Peony(5));
    john.get(new Freesia(3));
    john.get(new Lilac(3));

    // Pewnie je umieścił na wózku sklepowyem
    // Zobaczmy co tam ma
    ShoppingCart johnsCart = john.getShoppingCart();
    System.out.println("Before payment\n" + johnsCart);

    // Teraz za to zapłaci...
    john.pay();

    // Czy przypadkiem przy płaceniu nie okazało się,
    // że w koszu są kwiaty na które nie ustalono jeszcze ceny?
    // W takim arzie zostałyby usunięte z wózka i Janek nie płaciłby za nie
    // Również może mu zabraknąc pieniędzy, wtedy też kwaity są odkładane.

    System.out.println("After payment\n" + john.getShoppingCart());

    // Ile Jankowi zostało pieniędzy? 
    System.out.println("John's money left : $" + john.getCash());

    // Teraz jakos zapakuje kwiaty (może do pudełka)
    Box johnsBox = new Box(john);
    john.pack(johnsBox);

    // Co jest teraz w wózku Janka...
    // (nie powinno już nic być)
    System.out.println("After packing flowers to the box\n" + john.getShoppingCart());

    // a co w pudełku
    System.out.println(johnsBox);

    // Zobaczmy jaka jest wartość czerwonych kwiatów w pudełku Janka
    System.out.println("Red flowers in John's box has costed: "
        + valueOf(johnsBox, "red"));

    // Teraz przychodzi Stefan
    // ma tylko 60 zł
    Customer stefan = new Customer("Stefan", 60);

    // Ale nabrał kwiatów nieco za dużo jak na tę sumę
    stefan.get(new Lilac(3));
    stefan.get(new Rose(5));

    // co ma w wózku
    System.out.println(stefan.getShoppingCart());

    // płaci i pakuje do pudełka
    stefan.pay();
    Box stefansBox = new Box(stefan);
    stefan.pack(stefansBox);

    // co ostatecznie udało mu się kupić
    System.out.println(stefansBox);
    // ... i ile zostało mu pieniędzy
    System.out.println("Stefan's money left: $" + stefan.getCash());
  }
}
