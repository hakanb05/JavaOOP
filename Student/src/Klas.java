/**
 * doel: klas maken met student gegevens
 * @author Hakan Bektas
 */
import java.time.LocalDate;
public class Klas {
    final int MAX_AANTAL_STUDENTEN = 1;
    private String naam;
    private int aantalStudenten;
    private Student[] studenten;

    /**
     * initaliseren.
     * @param naam
     */
    public Klas(String naam) {
        this.naam = naam;
        this.aantalStudenten = 0;
        this.studenten = new Student[30];
    }

    /**
     *
     * @param student
     * @return true or false
     */
    public boolean voegStudentToe(Student student) {
        if (this.aantalStudenten >= MAX_AANTAL_STUDENTEN) {
            return false;
        } else {
            studenten[aantalStudenten] = student;
            this.aantalStudenten++;
            return true;
        }

    }

    public int getAantalStudenten() {
        return aantalStudenten;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(naam);
        sb2.append(" ");
        sb2.append(getAantalStudenten());
        sb2.append("\n");
        for (int i = 0; i < getAantalStudenten(); i++) {
            sb2.append(studenten[i]);
            sb2.append("\n");
        }
        sb2.append("\n");
        return sb2.toString();
    }
}
