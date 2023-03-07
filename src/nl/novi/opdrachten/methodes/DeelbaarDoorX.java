package nl.novi.opdrachten.methodes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Schrijf een methode die twee Integers ontvangt.
 * De eerste parameter heet 'number', de tweede 'divisible'
 *
 * Het is de bedoeling dat je checkt of 'number' deelbaar is door 'divisible'
 *
 * Wanneer het deelbaar is, return het volgende:
 * Het getal: %HIER GETAL% is deelbaar door %HIER DIVISIBLE%.
 * Wanneer het niet deelbaar is:
 * Het getal: %HIER GETAL% is niet deelbaar door %HIER DIVISIBLE%. Verlaag of verhoog het getal
 * %HET GETAL WAARMEE HET VERHOOGT OF VERLAAGD MOET WORDEN%
 *
 * VOORBEELD:
 *
 * De methode ontvangt de getallen 13 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 13 is niet deelbaar door 3. Verlaag het getal met 1.
 *
 * VOORBEELD 2:
 * De methode ontvangt de getallen 14 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 14 is niet deelbaar door 3. Verhoog het getal met 1.
 *
 */

public class DeelbaarDoorX {
    public static void main(String[] args) {
        userInput();
    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            System.out.println("What number do you want to divide");
            number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("This is not a valid number, please enter a number.");
            return;
        }

        System.out.println("By how much do you want to divide it");
        int divisible = scanner.nextInt();

        if (number % divisible == 0) {
            System.out.println("Het getal: " + number + "is deelbaar door:" + divisible);
        } else {
            int diffrence = divisible - (number % divisible);
            if (diffrence < 0) {
                System.out.println("Het getal:" + number + " is niet deelbaar door:" + divisible + "verhoog het getal met " + Math.abs(diffrence));
            } else {
                System.out.println("Het getal:" + number + " is niet deelbaar door:" + divisible + "verlaag het getal met " + diffrence);
            }

        }
    }
}
