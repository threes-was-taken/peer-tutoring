package be.kdg.peertutoring.week_7.Wijn;

import java.time.LocalDate;

public class Champagne extends Wijn{
    private final Smaak smaak;

    public Champagne(String naam, String streek, LocalDate oogstDatum, double basisPrijs, Smaak smaak) {
        super(naam, streek, oogstDatum, basisPrijs);
        this.smaak = smaak;
    }

    @Override
    public double berekenPrijs() {
        if (smaak.toString().toLowerCase().contains("brut")){
            return super.berekenPrijs() * 1.10;
        }else {
            return super.berekenPrijs();
        }
    }

    @Override
    public String toString() {
        return String.format("%s --> Type: %s", super.toString(), smaak);
    }
}
