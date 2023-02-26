package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOefening {

    public static void main(String[] uitlegList) {

        //We hebben een list die de namen van voetbalclubs bevat
        List<String> clubNames = new ArrayList<>();
        //Die vullen we alvast voor de opdracht
        clubNames.add("Ajax");
        clubNames.add("PSV");
        clubNames.add("Feyenoord");
        clubNames.add("Fc Utrecht");
        clubNames.add("Fc Groningen");
        clubNames.add("FC Twente");

        // Vraag -1: Maak een methode die al taak heeft om de list per regel uit te printen.
        for (String club : clubNames) {
            System.out.println(club);
        }
        // Vraag 0: Maak een methode die als taak heeft om de list uit te printen: positie + inhoud.
        // Bovenstaande list zou dan dit zijn:
        // 0 - Ajax
        // 1 - PSv
        // etc...
        for (int i = 0; i < clubNames.size(); i++) {
            System.out.println((i+1) + ". " + clubNames.get(i));
        }
        // Vraag 1: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.
        addClubNameIfNotExists(clubNames, "Ajax");
        addClubNameIfNotExists(clubNames, "Helmond Sport");
        System.out.println(clubNames);
        // Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.
        System.out.println(getClubNamePosition(clubNames, "Helmond Sport"));
        // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 1 staat, moeten de
        // clubs die voor Ajax staan verwijderd worden.
        // We voegen nog wat clubs toe om de code te kunnen testen.
        clubNames.add("AA Aachen");
        clubNames.add("AFC Amsterdam");
        clubNames.add("AFC");

        sortAndFilterNames(clubNames);
        System.out.println(clubNames);


        // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
        clubNames.add("Zlotty FC");
        clubNames.add("SC Eindhoven");
    }

    public static void addClubNameIfNotExists(List<String> clubNames, String name) {
        if (!clubNames.contains(name)) {
            clubNames.add(name);
        }
    }

    public static int getClubNamePosition(List<String> clubNames, String name) {
        return clubNames.indexOf(name);
    }

    public static void sortAndFilterNames(List<String> clubNames) {
        Collections.sort(clubNames);

        while (getClubNamePosition(clubNames, "Ajax") !=0) {
            clubNames.remove(0);
        }
        System.out.println(clubNames);
    }

    public static void sortAndFilterPsv(List<String> clubNames) {
        Collections.sort(clubNames);
        int indexPsv = getClubNamePosition(clubNames, "psv");
        List<String> tempList = new ArrayList<>();
        for (int i=0; i<clubNames.size(); i++) {
            if (i <= indexPsv) {
                tempList.add(clubNames.get(i));
            }
        }
    }

    /*while (clubNames.get(clubNames.size()-1) != "PSV"){
    clubNames.remove(clubNames.size()-1);
}*/
}
