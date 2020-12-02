/* Dries created on 2/12/2020 inside the package - be.kdg.peertutoring.week_8 */
package be.kdg.peertutoring.week_8;

import be.kdg.peertutoring.week_8.rekenen.Rekenmachine;
import be.kdg.peertutoring.week_8.rekenen.plugins.*;

import java.util.Scanner;

public class Main {
    private static Rekenmachine mijnCalc = new Rekenmachine();

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        mijnCalc.installeer(new Optelling());
        mijnCalc.installeer(new Aftrekking());
        mijnCalc.installeer(new Vermenigvuldiging());
        mijnCalc.installeer(new Deling());
        mijnCalc.installeer(new Macht());
        mijnCalc.installeer(new SquareRoot());
        mijnCalc.installeer(new Percentage());

        /*
        doeBerekeningEnDrukAf("+", 5, 2);
        doeBerekeningEnDrukAf("-", 5, 2);
        doeBerekeningEnDrukAf("*", 5, 2);
        doeBerekeningEnDrukAf("/", 5, 2);
        doeBerekeningEnDrukAf("^", 5, 2);
        doeBerekeningEnDrukAf("?", 5, 2);
        System.out.println(mijnCalc.toString());
         */

        while (true){
            System.out.println("Welkom bij de dynamische rekenmachine!");
            System.out.println(mijnCalc.toString());
            System.out.print("Welke berekening wenst U uit te voeren (<ENTER> om te stoppen)? ");
            String antwoord = keyboard.nextLine();
            if (!antwoord.equals("")){
                System.out.print("Geef twee getallen in (gescheiden door een spatie): ");
                String getal1 = keyboard.next();
                String getal2 = keyboard.next();
                double d1 = Double.parseDouble(getal1);
                double d2 = Double.parseDouble(getal2);
                doeBerekeningEnDrukAf(antwoord, d1, d2);
                keyboard.skip("\n");
            } else {
                System.out.println(mijnCalc.getLog());
                return;
            }
        }
    }

    private static void doeBerekeningEnDrukAf(String commando, double getal1, double getal2){
        System.out.printf("%.2f %s %.2f = %.2f\n"
                , getal1, commando, getal2
                , mijnCalc.bereken(commando, getal1, getal2));
    }
}
