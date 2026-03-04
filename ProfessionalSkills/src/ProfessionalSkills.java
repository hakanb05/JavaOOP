/**
 * Doel: Profession skill vakken aanmaken en gegevens meegeven.
 *
 * @author Hakan Bektas
 */
public class ProfessionalSkills extends Leseenheid {

    private boolean gehaald;

    /**
     * initialiseren van alle attributen.
     *
     * @param gehaald
     * @param naam
     * @param ects
     * @param studiejaar
     */
    public ProfessionalSkills(boolean gehaald, String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.gehaald = gehaald;
    }

    /**
     * Je kan de gehaald setten. Standaard is false maar je kan naar true en weer naar false veranderen.
     *
     * @param gehaald
     */
    public void setGehaald(boolean gehaald) {
        this.gehaald = gehaald;
    }

    /**
     * Default constructur. Nog 1tje maar dan met de standaard boolean. Je hoeft niet zelf intevullen
     *
     * @param naam
     * @param ects
     * @param studiejaar
     */
    public ProfessionalSkills(String naam, int ects, int studiejaar) {
        this(STANDAARD_BOOLEAN, naam, ects, studiejaar);
    }

    /**
     * Als de vak gelijk is aan false wat niet gehaald is is het false. Anders true en heb je het gehaald.
     *
     * @return of het vak is behaald of niet
     */
    public boolean isAfgerond() {
        if (gehaald != STANDAARD_BOOLEAN) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Doel: alle info weergeven
     *
     * @return de vorm van de tekst
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getNaam());
        sb.append(", ");
        sb.append(super.getEcts());
        sb.append(" ects, ");
        sb.append("studiejaar ");
        sb.append(super.getStudiejaar());
        sb.append(", ");
        if (!gehaald) {
            sb.append("Niet gehaald");
        } else {
            sb.append("Gehaald");
        }
        return sb.toString();
    }
}
