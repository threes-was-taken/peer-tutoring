package be.kdg.peertutoring.week_7;

import be.kdg.peertutoring.week_7.Wijn.*;

import java.time.LocalDate;

public class DemoWijnen {
    public static void main(String[] args) {
        //Controle na deel 1:
        //enkele testwijnen aanmaken:
        Wijn w1 = new Wijn("Gelso Nero", "Puglia", LocalDate.of(2013, 8, 10), 9.95);
        Wijn w2 = new Wijn("Barbera di Alba", "Piemonte", LocalDate.of(2015, 9, 25), 10.50);
        Wijn w3 = new Wijn("Gelso di Oro", "Puglia", LocalDate.of(2014, 9, 5), 22);
        Wijn w4 = new Wijn("Toscana Rosso", "Toscana", LocalDate.of(2013, 10, 1), 6.95);
        Wijn w5 = new Wijn("Montefreddo", "Emilia Romagna", LocalDate.of(2001, 8, 4), 8.95);

        System.out.println("=== CONTROLE NA BASISOPDRACHT 1 ===");

        //toString oproepen en afdrukken:
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);
        System.out.println(w5);
        //Controle na deel 2:
        System.out.println("\n=== CONTROLE NA BASISOPDRACHT 2 ===");
        Wijn w6 = new Likeur("Amaretto", "Verona", LocalDate.of(2007, 3, 30), 42.50, 0.29);
        Wijn w7 = new Likeur("Elixir d'Anvers", "Wilrijk", LocalDate.of(2013, 5, 21), 32, 0.52);
        //toString oproepen en afdrukken:
        System.out.println(w6);
        System.out.println(w7);

        //Controle na deel 3 en 4:
        System.out.println("\n=== CONTROLE NA BASISOPDRACHT 3 en 4 ===");
        Wijn w8 = new Champagne("Lancelot Reserve", "Cramant", LocalDate.of(2015, 10, 10), 18.20, Smaak.EXTRA_BRUT);
        Wijn w9 = new Champagne("Lancelot Chevalier", "Cramant", LocalDate.of(2014, 9, 26), 17.60, Smaak.BRUT);
        Wijn w10 = new Champagne("Bandock Des Lys", "Reims", LocalDate.of(2014, 10, 2), 17, Smaak.DOUX);
        //toString oproepen en afdrukken:
        System.out.println(w8);
        System.out.println(w9);
        System.out.println(w10);

        //Controle na opdracht 5.1 en 5.2 en 5.3:
        System.out.println("\n=== CONTROLE NA OPGAVE 5.1 en 5.2 en 5.3 ===");
        //wijnhuis aanmaken:
        WijnHuis wh = new WijnHuis("Legras & Haas");

        //wijnhuis bevoorraden:
        wh.voegWijnToe(w1);
        wh.voegWijnToe(w2);
        wh.voegWijnToe(w3);
        wh.voegWijnToe(w4);
        wh.voegWijnToe(w5);
        wh.voegWijnToe(w6);
        wh.voegWijnToe(w7);
        wh.voegWijnToe(w8);
        wh.voegWijnToe(w9);
        wh.voegWijnToe(w10);
        Wijn w11 = new Wijn("Zuidflank", "Limburg", LocalDate.of(2012, 7, 15), 12.50);

        //wijnen opzoeken:
        System.out.println("Op zoek naar wijnen:");
        System.out.println("Lancelot Chevalier: " + wh.zoekWijn(w9));
        System.out.println("Zuidflank: " + wh.zoekWijn(w11));
        Wijn oudste = wh.getOudsteWijn();
        System.out.printf("Oudste wijn: %s = %d\n", oudste.getNaam(), oudste.getOogstDatum().getYear());

		//Controle na deel 5.4:
        //wijnhuis afdrukken:
        System.out.println("\n=== CONTROLE NA OPGAVE 5.4 ===");
        System.out.println(wh);
    }
}
