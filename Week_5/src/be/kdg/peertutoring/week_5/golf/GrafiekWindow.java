package be.kdg.peertutoring.week_5.golf;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * PEER TUTORING P1W5
 */
public class GrafiekWindow extends JFrame {
    private static final int WINDOW_SIZE = 100;

    private class Punt {
        int x, y;
        Color kleur;
    }

    private final List<Punt> punten;
    private final double breedte;
    private final double hoogte;

    public GrafiekWindow(double breedte, double hoogte) {
        super("Golvengrafiek");
        this.breedte = breedte;
        this.hoogte = hoogte;
        this.punten = new ArrayList<>();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize((int) (breedte * WINDOW_SIZE), (int) (hoogte * WINDOW_SIZE));
        setResizable(false);
    }

    public void paint(Graphics g) {
        super.paint(g);
        tekenAssen(g);
        for (Punt p : punten) {
            g.setColor(p.kleur);
            g.fillOval(p.x - 1, p.y - 1, 2, 2);
        }
    }

    private void tekenAssen(Graphics g) {
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
        g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
        for (double x = -breedte / 2; x < breedte / 2; x++) tekenPunt(x, 0, Color.black);
        for (double y = -hoogte / 2; y < hoogte / 2; y++) tekenPunt(0, y, Color.black);
    }

    public void tekenPunt(double x, double y, Color kleur) {
        Punt p = new Punt();
        //Coordinaten herrekenen zodat O,O in het midden is en herschalen
        p.x = (int) (x * this.getWidth() / breedte + this.getWidth() / 2);
        p.y = (int) (-y * this.getHeight() / hoogte + this.getHeight() / 2);
        p.kleur = kleur;
        punten.add(p);
    }

    public void toon() {
        this.setVisible(true);
    }
}
