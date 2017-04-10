/**
 *
 *  @author Golanka Wiktoria S15565
 *
 */

package zad1;


public class Test {

  public static void main(String[] args) {
    Patient[] patient = { new BrokenBone("John"),
                           new Cold("Alex"),
                           new RunnyNose("Marian")
                         };

    for (Patient p : patient) {
      System.out.println("Patient:     " + p.surname() + '\n' +
                         "Sick on:     " + p.disease() + '\n' +
                         "Treatment:   " + p.treatment() +"\n\n"
                         );
    }
  }
} 
