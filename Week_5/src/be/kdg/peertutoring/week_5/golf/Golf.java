package be.kdg.peertutoring.week_5.golf;

import java.awt.*;

public class Golf {
    private double amplitude;
    private double frequentie;
    private Color color;

    public Golf() {
        this.amplitude = 1.0;
        this.frequentie = 1.0;
    }

    public void setAmplitude(double amplitude) {
        this.amplitude = amplitude;
    }

    public void setFrequentie(double frequentie) {
        this.frequentie = frequentie;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getYValue(double value){
        return this.amplitude * Math.sin(this.frequentie * value);
    }


    @Override
    public String toString() {
        if (this.amplitude == 1){
            return "y = sin(" + this.frequentie + " x)";
        } else if (this.frequentie == 1){
            return "y = " + this.amplitude +" sin(x)";
        } else {
            return "y = "+ this.amplitude +" sin(" + this.frequentie + " x)";
        }
    }
}
