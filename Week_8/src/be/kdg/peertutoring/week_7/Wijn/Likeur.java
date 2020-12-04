package be.kdg.peertutoring.week_7.Wijn;

import java.time.LocalDate;

public class Likeur extends Wijn {
    private final double alcoholGehalte;

    public Likeur(String naam, String streek, LocalDate oogstDatum, double basisPrijs, double alcoholGehalte) {
        super(naam, streek, oogstDatum, basisPrijs);
        this.alcoholGehalte = alcoholGehalte;
    }

    @Override
    public double berekenPrijs() {
        if (alcoholGehalte >= 0.5){
            return super.berekenPrijs() * 1.25;
        }else{
            return super.berekenPrijs();
        }
    }

    @Override
    public String toString() {
        return String.format("%s --> %.0f%% alc", super.toString(), alcoholGehalte *100);
    }
}
