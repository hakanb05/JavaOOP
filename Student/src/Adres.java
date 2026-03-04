/**
 * doel: klas maken met student gegevens
 * @author Hakan Bektas
 */
public class Adres {
    private String straat;
    private int huisnummer;
    private String postcode;
    private String plaats;

    /**
     * Intialiseren van de attributs
     * @param straat
     * @param huisnummer
     * @param postcode
     * @param plaats
     */
    public Adres(String straat, int huisnummer, String postcode, String plaats) {
        this.straat = straat;
        this.huisnummer = huisnummer;
        this.postcode = postcode;
        this.plaats = plaats;
    }

    /**
     * terug weergeven
     * @return
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(straat);
        sb.append(" ");
        sb.append(huisnummer);
        sb.append(", ");
        sb.append(postcode);
        sb.append(", ");
        sb.append(plaats);
        return sb.toString();
    }

    /**
     * Cheken of de postcode geldig is.
     * @param postcode
     * @return
     */
    public static boolean
    isGeldigePostcode(String postcode) {
        if (postcode.length() >= 7) {
            return false;
        }
        return postcode.matches("[1-9]{1}[0-9]{3}[a-zA-Z]{2}");
    }
}


