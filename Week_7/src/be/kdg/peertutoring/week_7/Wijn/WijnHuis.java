package be.kdg.peertutoring.week_7.Wijn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WijnHuis {
    private static final int MAX_AANTAL = 10;
    private final List<Wijn> wijnen = new ArrayList<>();  //voorlopig gevuld met 10 null-objecten
    private final String naam;
    private int aantal;

    public WijnHuis(String naam) {
        this.naam = naam;
    }

    public void voegWijnToe(Wijn wijn) {
        if (!zoekWijn(wijn) && this.aantal < MAX_AANTAL){
            wijnen.add(wijn);
            this.aantal = wijnen.size();
        }
    }

    public boolean zoekWijn(Wijn wijn) {
        for (Wijn w :
                wijnen) {
            if (w.getNaam().equals(wijn.getNaam())){
                return true;
            }
        }
        return false;
    }

    public Wijn getOudsteWijn() {
        if (!wijnen.isEmpty()){
            Collections.sort(wijnen);
            return wijnen.get(0);
        }else{
            return null;
        }
    }

    @Override
    public String toString() {

        StringBuilder wijnenTekst = new StringBuilder();
        StringBuilder champagneTekst = new StringBuilder();
        StringBuilder likeurenTekst = new StringBuilder();

        wijnenTekst.append("Wijnen:\n");
        likeurenTekst.append("Likeuren:\n");
        champagneTekst.append("Champagnes:\n");

        for (Wijn wijn :
                wijnen) {
            if (wijn instanceof Likeur){
                likeurenTekst.append("\t").append(wijn).append("\n");
            }else if (wijn instanceof Champagne){
                champagneTekst.append("\t").append(wijn).append("\n");
            }else{
                wijnenTekst.append("\t").append(wijn).append("\n");
            }
        }

        return String.format("Wijnhuis %s\n", naam.toUpperCase()) +
                wijnenTekst + champagneTekst + likeurenTekst;
    }
}
