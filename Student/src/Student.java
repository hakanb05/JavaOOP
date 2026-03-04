/**
 * doel: klas maken met student gegevens
 * @author Hakan Bektas
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private int studentnummer;
    private String voornaam;
    private String achternaam;
    private LocalDate geboortedatum;
    private Adres adres;

    /**
     * Intialiseren
     * @param studentnummer
     * @param voornaam
     * @param achternaam
     * @param geboortedatum
     * @param adres
     */
    public Student(int studentnummer, String voornaam, String achternaam, LocalDate geboortedatum, Adres adres) {
        this.studentnummer = studentnummer;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
        this.adres = adres;
    }

    /**
     * Geboortedatum formatten
     * @return date in het kort
     */
    public String krijgKorteGeboortedatum() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return formatter.format(this.geboortedatum);
    }

    /**
     * gegevens uitprinten
     * @return alles netjes
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(studentnummer);
        sb.append(" ");
        sb.append(voornaam);
        sb.append(" ");
        sb.append(achternaam);
        sb.append("(");
        sb.append(krijgKorteGeboortedatum());
        sb.append(")");
        sb.append("\nAdres: ");
        sb.append(adres);
        return sb.toString();
    }

}
