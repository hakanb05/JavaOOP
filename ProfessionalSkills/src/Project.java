/**
 * Doel: project vak laten maken
 *
 * @author Hakan Bektas
 */
public class Project extends Leseenheid {
    private double productcijfer;
    private double procescijfer;
    private double methodenEnTechniekenCijfer;

    /**
     * intialiseren
     *
     * @param productcijfer
     * @param procescijfer
     * @param methodenEnTechniekenCijfer
     * @param naam
     * @param ects
     * @param studiejaar
     */
    public Project(double productcijfer, double procescijfer, double methodenEnTechniekenCijfer, String naam, int ects,
                   int studiejaar) {
        super(naam, ects, studiejaar);
        this.productcijfer = productcijfer;
        this.procescijfer = procescijfer;
        this.methodenEnTechniekenCijfer = methodenEnTechniekenCijfer;
    }

    /**
     * intialiseren met defaults.
     *
     * @param naam
     * @param ects
     * @param studiejaar
     */
    public Project(String naam, int ects, int studiejaar) {
        this(STANDAARD_CIJFER, STANDAARD_CIJFER, STANDAARD_CIJFER, naam, ects, studiejaar);
    }


    /**
     * je kan cijfer aanpassen van product proces en method
     *
     * @param productcijfer
     */
    public void setProductcijfer(double productcijfer) {
        this.productcijfer = productcijfer;
    }

    public void setProcescijfer(double procescijfer) {
        this.procescijfer = procescijfer;
    }

    public void setMethodenEnTechniekenCijfer(double cijfer) {
        this.methodenEnTechniekenCijfer = cijfer;
    }

    /**
     * Cheken of je de vak hebt afgerond. Zodra 1 onv is niet gehaald.
     *
     * @return vak gehaald true of false
     */
    public boolean isAfgerond() {
        if (productcijfer < ONDERGRENS_VOLDOENDE || procescijfer < ONDERGRENS_VOLDOENDE ||
                methodenEnTechniekenCijfer < ONDERGRENS_VOLDOENDE) {
            return false;
        } else {
            return true;
        }

    }

    /**
     * alles laten zien
     *
     * @return alle info
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getNaam());
        sb.append(", ");
        sb.append(super.getEcts());
        sb.append(" ects, ");
        sb.append("studiejaar ");
        sb.append(super.getStudiejaar());
        sb.append(" ");
        sb.append("(");
        sb.append(productcijfer);
        sb.append(", ");
        sb.append(procescijfer);
        sb.append(", ");
        sb.append(methodenEnTechniekenCijfer);
        sb.append(")");

        return sb.toString();
    }
}
