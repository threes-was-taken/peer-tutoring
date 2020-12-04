package be.kdg.peertutoring.week_7.Wijn;

public enum Smaak {
    BRUT("Brut"),
    EXTRA_BRUT("Extra-brut"),
    BRUT_SANS_MILLESIME("Brut sans Millésime"),
    SEC("Sec"),
    DEMI_SEC("Demi-sec"),
    DOUX("Doux");

    private final String smaak;

    Smaak(String smaak) {
        this.smaak = smaak;
    }

    @Override
    public String toString() {
        return smaak;
    }
}
