import java.time.LocalDate;

public class Cabaretier extends Artiest {
    private String voornaam;
    private String achternaam;
    private String artiestennaam;
    private LocalDate geboortedatum;
    private static String leegString = " ";

    public Cabaretier(String genre, String voornaam, String achternaam, String artiestennaam, LocalDate geboortedatum){
        super(genre);
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.artiestennaam = artiestennaam;
        this.geboortedatum = geboortedatum;
    }

    public Cabaretier(String genre, String voornaam, String achternaam, LocalDate geboortedatum) {
        this(genre,voornaam,achternaam, leegString ,geboortedatum);
    }

    @Override
    public String krijgnaam() {
        if (artiestennaam.equals(leegString) || artiestennaam.equals("")) {
            return voornaam + " " + achternaam;
        } else {
            return artiestennaam;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" geboortedatum: ");
        sb.append(geboortedatum);
        return sb.toString();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
