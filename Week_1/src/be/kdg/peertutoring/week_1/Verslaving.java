package be.kdg.peertutoring.week_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Verslaving {
    public static void main(String[] args) {
        //Uitbreiding A
        String naam = "";

        //Uitbreiding C
        int aantalUsers = 0;
        String oldUser = "xxx";

        int aantalJa = 0;
        String antwoord;
        Scanner kb = new Scanner(System.in);

        //Uitbreiding B
        while (true){
            System.out.println("Wat is uw naam?");
            naam = kb.nextLine();

            if (!naam.equals(oldUser)){
                oldUser = naam;
            }

            System.out.println("---------------------------------------------------");
            System.out.println("Hallo " + naam + "!!!");
            System.out.println("Welkom bij de Digitale Verslavingsquiz!!");
            System.out.println("U kan antwoorden in volgende vormen:\n- Ja / ja / J\n- Nee / nee / N");
            System.out.println("---------------------------------------------------");

            //Vraag 1
            System.out.println("Vraag 1: Het laatste wat ik doe -voor ’s avonds het licht uit gaat- is nog snel even kijken of er nog iets aan berichten, enz is binnengekomen op mijn smartphone." +
                    "\nWat is je antwoord?");
            antwoord = kb.nextLine();
            if (antwoord.equals("ja") || antwoord.equals("Ja") || antwoord.equals("J")) {
                aantalJa++;
            }
            //Vraag 2
            System.out.println("Vraag 2: Het eerste wat ik doe -al ’s morgens het licht aangaat- is kijken of er berichten, enz zijn binnengekomen op mijn smartphone." +
                    "\nWat is je antwoord?");
            antwoord = kb.nextLine();
            if (antwoord.equals("ja") || antwoord.equals("Ja") || antwoord.equals("J")) {
                aantalJa++;
            }
            //Vraag 3
            System.out.println("Vraag 3: Ik heb notificaties (die een geluidje/of een trilbeweging maken) geactiveerd op mijn smartphone." +
                    "\nWat is je antwoord?");
            antwoord = kb.nextLine();
            if (antwoord.equals("ja") || antwoord.equals("Ja") || antwoord.equals("J")) {
                aantalJa++;
            }
            //Vraag 4
            System.out.println("Vraag 4: Wanneer ik merk dat er een notificatie op mijn smartphone is binnen gekomen, kijk ik binnen de minuut op mijn smartphone wat het precies is." +
                    "\nWat is je antwoord?");
            antwoord = kb.nextLine();
            if (antwoord.equals("ja") || antwoord.equals("Ja") || antwoord.equals("J")) {
                aantalJa++;
            }

            //Vraag 5
            System.out.println("Vraag 5: Terwijl is naar een tv-reeks of film kijk op TV of computerscherm, gebruik ik één of meerdere keren mijn smartphone." +
                    "\nWat is je antwoord?");
            antwoord = kb.nextLine();
            if (antwoord.equals("ja") || antwoord.equals("Ja") || antwoord.equals("J")) {
                aantalJa++;
            }

            //Vraag 6
            System.out.println("Vraag 6: Als ik alleen eet (ontbijt/lunch/diner) gebruik ik meermaals mijn smartphone tijdens de maaltijd." +
                    "\nWat is je antwoord?");
            antwoord = kb.nextLine();
            if (antwoord.equals("ja") || antwoord.equals("Ja") || antwoord.equals("J")) {
                aantalJa++;
            }

            //Vraag 7
            System.out.println("Vraag 7: Als ik in gezelschap -familie, vrienden,… eet (ontbijt/lunch/diner) gebruik ik meermaals mijn smartphone tijdens de maaltijd." +
                    "\nWat is je antwoord?");
            antwoord = kb.nextLine();
            if (antwoord.equals("ja") || antwoord.equals("Ja") || antwoord.equals("J")) {
                aantalJa++;
            }

            //Vraag 8
            System.out.println("Vraag 8: Als ik sta te wachten (op een bus, trein, tram, een vriend(in),..), gebruik ik mijn smartphone." +
                    "\nWat is je antwoord?");
            antwoord = kb.nextLine();
            if (antwoord.equals("ja") || antwoord.equals("Ja") || antwoord.equals("J")) {
                aantalJa++;
            }

            //Vraag 9
            System.out.println("Vraag 9: Als in -alleen- op straat loop doe ik dat met mijn smartphone in de hand en kijk ik geregeld naar het scherm." +
                    "\nWat is je antwoord?");
            antwoord = kb.nextLine();
            if (antwoord.equals("ja") || antwoord.equals("Ja") || antwoord.equals("J")) {
                aantalJa++;
            }

            //Vraag 10
            System.out.println("Vraag 10: Als ik fiets of met de auto rij, durf ik wel eens de smartphone in de hand te nemen en naar het scherm te kijken." +
                    "\nWat is je antwoord?");
            antwoord = kb.nextLine();
            if (antwoord.equals("ja") || antwoord.equals("Ja") || antwoord.equals("J")) {
                aantalJa++;
            }

            //Check score
            System.out.printf("%s, je score is %d", naam, aantalJa);
            if (aantalJa == 0) {
                System.out.println("Je bent niet digitaal verslaafd! Houden zo!");
            } else if (0 < aantalJa && aantalJa <= 2) {
                System.out.println("Je hebt een milde vorm van digitale verslaving.");
            } else if (3 <= aantalJa && aantalJa <= 5) {
                System.out.println("Je hebt een niet te onderschatten vorm van digitale verslaving. Leg jezelf wat beperkingen op.");
            } else if (6 <= aantalJa && aantalJa <= 8) {
                System.out.println("Je hebt een ernstige vorm van digitale verslaving. Overweeg om een digitale detox-cursus te volgen!");
            } else {
                System.out.println("Je hebt een extreme vorm van digitale verslaving. Jouw verslaving vormt een gevaar voor jezelf en jouw omgeving. Zoek zo snel mogelijk hulp!!");
            }

            System.out.println("Wenst u te stoppen met de quiz?[Y/N]");
            if (kb.nextLine().equals("Y")){
                System.exit(1);
            }

        }
    }
}
