package nl.novi.opdrachten.methodes;

/**
 * Schrijf een methode die een Integer ontvangt.
 * Wanneer het getal deelbaar is door 5, laat hem de volgende tekst returnen:
 * 'deelbaar door vijf'
 * Wanneer het getal niet deelbaar is door vijf:
 * 'ondeelbaar door vijf'
 */
public class DeelbaarDoorVijf {

    public static void main(String[] sammieKijkOmhoog) {
        int chosenNumber = 44;
        tellen(chosenNumber);
    }

    public static void tellen(int chosenNumber) {
        if (chosenNumber % 5 == 0) {
            System.out.println("Deelbaar door vijf");
        } else {
            System.out.println("Ondeelbaar door vijf");
        }
    }
}
