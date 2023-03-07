package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeheimeCode {

    public static void main(String[] secret) {

        List<String> laResistanceMembers = new ArrayList<>();

        laResistanceMembers = addMembers(laResistanceMembers, "Arie");
        laResistanceMembers = addMembers(laResistanceMembers, "Sjaak");
        laResistanceMembers = addMembers(laResistanceMembers, "Henrie");
        laResistanceMembers = addMembers(laResistanceMembers, "Piet");
        laResistanceMembers = addMembers(laResistanceMembers, "LeDroitCestMoi");


        System.out.println(encryptList(laResistanceMembers));
        System.out.println("----------");
        System.out.println(decryptedList(laResistanceMembers));

        /*
        Opdracht 1: Hierboven zijn via de methode addMembers, leden aan de lijst toegevoegd. Pas de Methode zo aan dat
         er alleen unieke namen in voor mogen komen.
         */

        /*
        Opdracht 2: La Resistance wil niet dat de lijst met namen zo in handen komt te vallen van de bezetter. Versleutel
        Maak een methode die de lijst op de volgende manier versleuteld:
        a) Verander elke letter naar het nummer in het alfabet. Voeg na elke veranderde letter een - toe
        (behalve de laatste). Dus a wordt 1, b wordt 2 et cetera.
        Wanneer een letter een hoofdletter is, moet je beginnen met tellen bij 100. Dus A wordt 101, B wordt 102.
        Voorbeeld: Alex wordt versleuteld naar: 101-12-5-24
        b) Als de positie in de lijst een even getal is, dan moet de cijfercombinatie omgedraaid worden.
         */

        /*
        Opdracht 3:
        Schrijf een methode die de versleutelde lijst kan omzetten naar de ontsleutelde lijst.
         */
    }

    private static List<String> addMembers(List<String> members, String name) {
        if (!members.contains(name)) {
            members.add(name);
        }
        return members;
    }

    public static List<String> encryptList(List<String> list) {
        List<String> encryptedList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            StringBuilder encryptedName = new StringBuilder();

            for (int j = 0; j < name.length(); j++) {
                char c = name.charAt(j);

                if (Character.isLetter(c)) {
                    int num = Character.toUpperCase(c) - 'A' + 1;
                    if (Character.isUpperCase(c)) {
                        num += 100;
                    }
                    encryptedName.append(num);
                    if (j < name.length() - 1) {
                        encryptedName.append("-");
                    }
                }
            }

            if (i % 2 == 1) {
                encryptedName.reverse();
            }

            encryptedList.add(encryptedName.toString());
        }

        return encryptedList;
    }

    public static List<String> decryptedList(List<String> encryptedList) {
        List<String> decryptedList = new ArrayList<>();

        for (String encryptedName : encryptedList) {
            StringBuilder decryptedName = new StringBuilder();
            String[] nameParts = encryptedName.split("-");

            for (String part : nameParts) {
                int number = Integer.parseInt(part);
                if (number >= 100) {
                    decryptedName.append((char) (number - 100 + 'A'));
                } else {
                    decryptedName.append((char) (number + 'a' - 1));
                }
            }

            if (decryptedList.size() % 2 == 1) {
                decryptedName.reverse();
            }

            decryptedList.add(decryptedName.toString());
        }
        return decryptedList;
    }
}

