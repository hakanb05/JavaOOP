/**
 * Doel: Vak voegen
 *
 * @author Hakan Bektas
 */
public class Vak extends Leseenheid {
    private double cijfer;

    /**
     * intialiseren
     *
     * @param cijfer
     * @param naam
     * @param ects
     * @param studiejaar
     */
    public Vak(double cijfer, String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.cijfer = cijfer;
    }

    /**
     * initaliseren met standaard waardes
     *
     * @param naam
     * @param ects
     * @param studiejaar
     */
    public Vak(String naam, int ects, int studiejaar) {
        this(STANDAARD_CIJFER, naam, ects, studiejaar);
    }

    /**
     * cijfer kan je aanopassen
     *
     * @param cijfer
     */
    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    /**
     * als cijfer kleiner is dan 5.5 false voor afronden hoger true
     *
     * @return of het is afgerond
     */
    public boolean isAfgerond() {
        if (cijfer >= ONDERGRENS_VOLDOENDE) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Weergeven van alles
     *
     * @return alle info
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.getNaam());
        sb.append(", ");
        sb.append(super.getEcts());
        sb.append(" ects, ");
        sb.append("studiejaar ");
        sb.append(super.getStudiejaar());
        sb.append(", ");
        sb.append("cijfer ");
        sb.append(cijfer);

        return sb.toString();
    }
}
