package be.kdg.peertutoring.week_7.Wijn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WijnHuis {
    private static final int MAX_AANTAL = 10;
    private List<Wijn> wijnen = new ArrayList<>();  //voorlopig gevuld met 10 null-objecten
    private String naam;
    private int aantal;

    public WijnHuis(String naam) {
        this.naam = naam;
    }

    public void voegWijnToe(Wijn wijn) {
        if (!zoekWijn(wijn) && wijnen.size() < 10){
            wijnen.add(wijn);
            aantal = wijnen.size();
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
        Collections.sort(wijnen);
        return wijnen.get(0);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Wijnhuis %s\n", naam.toUpperCase()));

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

        result.append(wijnenTekst).append(champagneTekst).append(likeurenTekst);

        return result.toString();
    }
}
