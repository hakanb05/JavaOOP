/**
 * Doel: Parent class aanmaken en de standaarden/ constanten meegeven.
 *
 * @author Hakan Bektas
 */
public class Leseenheid {
    protected static final int STANDAARD_CIJFER = -1;
    protected static final double ONDERGRENS_VOLDOENDE = 5.5;
    protected static final boolean STANDAARD_BOOLEAN = false;
    private String naam;
    private int ects;
    private int studiejaar;

    /**
     * intialiseren
     *
     * @param naam
     * @param ects
     * @param studiejaar
     */
    public Leseenheid(String naam, int ects, int studiejaar) {
        this.naam = naam;
        this.ects = ects;
        this.studiejaar = studiejaar;
    }

    /**
     * Alle info weergeven
     *
     * @return alles wat je ziet
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(naam);
        sb.append(", ");
        sb.append(ects);
        sb.append(" ects,");
        sb.append(" studiejaar ");
        sb.append(studiejaar);

        return sb.toString();
    }

    /**
     * naam pakken omdat het private is zodat child classen kunnen pakken
     *
     * @return naam ect en studiejaar
     */
    public String getNaam() {
        return naam;
    }

    public int getEcts() {
        return ects;
    }

    public int getStudiejaar() {
        return studiejaar;
    }
}
