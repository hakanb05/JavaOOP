public class Knaller extends Vuurwerk{

    private int aantalKnallen;
    private int decibel;


    public Knaller(String naam, double prijs, int aantalKnallen, int decibel, Instructie instructie) {
        super(naam, prijs, instructie);
        this.aantalKnallen = aantalKnallen;
        this.decibel = decibel;
    }

    @Override
    public boolean isLegaal() {
        int max_decibel = 120;
        if (super.isLegaal() && decibel <= max_decibel) {
            return true;
        } else {
            return false;
        }
    }

    public int getDecibel() {
        return decibel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n\tAantal kanllen: ").append(aantalKnallen).append("\n\tDecibel: ").append(decibel);
        return sb.toString();
    }
}
