package be.kdg.peertutoring.week_2;

import java.util.Scanner;

public class Conversie {
    public static void main(String[] args) {
        System.out.println("Conversie graden Celsius - Fahrenheit");
        System.out.println("=====================================");
        Scanner kb = new Scanner(System.in);
        while(true){
            System.out.println("Welke conversie wens je te doen?\n\t1)°C naar °F\n\t2)°F naar °C\nUw keuze? ");
            int keuze = kb.nextInt();

            if (keuze != 0 && keuze < 3){
                if (keuze == 1){
                    System.out.println("Geef de waarde in °C: ");
                    int c = kb.nextInt();
                    double f = (c * 1.8) + 32;
                    System.out.println(c + "°C = " + f + "°F") ;
                }else{
                    System.out.println("Geef de waarde in °F: ");
                    int f = kb.nextInt();
                    double c = (f-32) * 0.5556;
                    System.out.println(f + "°F = " + c + "°C");
                }
            } else if(keuze == 0) {
                System.out.println("Afsluiten...");
                System.exit(1);
            } else if (keuze >= 3){
                System.out.println("Dit is geen geldige keuze, gelieve te kiezen tussen 1 en 2.");
            }
        }
    }
}
