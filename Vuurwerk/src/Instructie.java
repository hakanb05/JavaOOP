
/**
 * Deze class is al voor je gemaakt
 */
public class Instructie {

    private boolean nederlandstalig;
    private int minimumLeeftijd;
    private String omschrijving;

    public Instructie(boolean nederlandstalig, int minimumLeeftijd, String omschrijving) {
        this.nederlandstalig = nederlandstalig;
        this.minimumLeeftijd = minimumLeeftijd;
        this.omschrijving = omschrijving;
    }

    public boolean isNederlandstalig() {
        return nederlandstalig;
    }

    public int getLeeftijd() {
        return minimumLeeftijd;
    }

    @Override
    public String toString() {
        return "Nederlandstalig=" + nederlandstalig + ", leeftijd=" + minimumLeeftijd + ", omschrijving=" + omschrijving;
    }
}
