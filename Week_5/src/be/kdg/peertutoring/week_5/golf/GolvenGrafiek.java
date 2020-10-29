package be.kdg.peertutoring.week_5.golf;

import java.awt.*;
import java.util.Random;

public class GolvenGrafiek {
    private int aantal;
    private Random random;

    public GolvenGrafiek(int aantal) {
        this.aantal = aantal;
        this.random = new Random();
    }

    public void tekenGolven(){
        GrafiekWindow window = new GrafiekWindow(10,6);
        Golf golf = new Golf();
        for (int i = 0; i < aantal; i++) {
            golf.setAmplitude(random.nextDouble() * 4.0);
            golf.setFrequentie(random.nextDouble() * 4.0);
            int r = random.nextInt(255);
            int g = random.nextInt(255);
            int b = random.nextInt(255);
           golf.setColor(new Color(r,g,b));
            for (double j = -5.0; j <= 5.0; j+=0.001) {
                window.tekenPunt(j, golf.getYValue(j), golf.getColor());
            }
        }
        window.toon();
    }
}
