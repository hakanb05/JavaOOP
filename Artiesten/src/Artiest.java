import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Artiest implements Comparable{
    private String genre;
    private ArrayList<LocalDate> boekingen = new ArrayList<>();

    public Artiest(String genre) {
        this.genre = genre;
    }

    public boolean boek(LocalDate datum) {
        for (int i = 0; i < boekingen.size(); i++) {
            if (boekingen.get(i).equals(datum)) {
                return false;
            }
        }
        boekingen.add(datum);
            return true;

    }

    public abstract String krijgnaam();

    public int krijgAantalBoekingen() {
        return boekingen.size();
    }

//    public String getGenre() {
//        return genre;
//    }


    public int compareTo(Artiest o) {
        if (this.genre.compareTo(o.genre) == 0) {
            return 0;
        } else if (this.genre.compareTo(o.genre) > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(krijgnaam());
        sb.append("(");
        sb.append(genre);
        sb.append("), aantal boekingen: ");
        sb.append(krijgAantalBoekingen());
        return sb.toString();
    }
}
