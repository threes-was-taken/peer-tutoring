package be.kdg.peertutoring.week_2;

import java.util.Scanner;

public class Conversie_Deel2 {
    public static void main(String[] args) {
        System.out.println("Conversie graden Celsius - Fahrenheit");
        System.out.println("=====================================");
        Scanner kb = new Scanner(System.in);

        System.out.println("Geef hier de begin waarde in °C: ");
        int start = kb.nextInt();
        System.out.println("Geef hier de eindwaarde in °C: ");
        int einde = kb.nextInt();

        if (start > einde){
            System.out.println("De begintemperatuur moet kleiner zijn dan de eindtemperatuur");
            System.exit(1);
        }

        System.out.println("Geef de stapwaarde: ");
        int stap = kb.nextInt();
        double f;


        int val = start;

        String leftAlignFormat = "| %-5d | %-5.1f |%n";

        System.out.format("+-------+-------+%n");
        System.out.format("| °C    | °F    |%n");
        System.out.format("+-------+-------+%n");

        while(val <= einde){
            f = (val * 1.8) + 32;
            System.out.format(leftAlignFormat, val, f);
            val += stap;
        }
        System.out.format("+-------+-------+%n");
    }
}
