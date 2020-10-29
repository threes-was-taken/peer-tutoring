package be.kdg.peertutoring.week_5;

import be.kdg.peertutoring.week_5.golf.Golf;
import be.kdg.peertutoring.week_5.golf.GolvenGrafiek;

public class GolfTest {
    public static void main(String[] args) {
        Golf golf = new Golf();
        for (double i = 1.0; i <= 5.0; i+=0.5) {
            golf.setAmplitude(i);
            golf.setFrequentie(2.0);
            System.out.println(golf.toString());
        }
        GolvenGrafiek grafiek = new GolvenGrafiek(25);
        grafiek.tekenGolven();
    }
}
