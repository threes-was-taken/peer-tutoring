package be.kdg.peertutoring.week_7.Wijn;

import java.time.LocalDate;


public class Wijn implements Comparable<Wijn>{
    private final String naam;
    private final String streek;
    private final LocalDate oogstDatum;
    private final double basisPrijs;

    public Wijn(String naam, String streek, LocalDate oogstDatum, double basisPrijs) {
        this.naam = naam;
        this.streek = streek;
        this.oogstDatum = oogstDatum;
        this.basisPrijs = basisPrijs;
    }

    public String getNaam() {
        return naam;
    }
    public String getStreek() {
        return streek;
    }
    public LocalDate getOogstDatum() {
        return oogstDatum;
    }
    protected double getBasisPrijs() {
        return basisPrijs;
    }

    public double berekenPrijs() {
        return getBasisPrijs();
    }

    public final String getKenmerken(){
        return String.format("Van %s, afkomstig uit %s", oogstDatum.getYear(), streek);
    }

    @Override
    public String toString() {
        return String.format("%-45s €\t%6.2f\n\t( %s )", naam, berekenPrijs(), getKenmerken());
    }

    @Override
    public int compareTo(Wijn w){
        if (w.getOogstDatum() == null || getOogstDatum() == null){
            return 0;
        }
        return getOogstDatum().compareTo(w.getOogstDatum());
    }
}
