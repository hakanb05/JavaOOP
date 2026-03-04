import java.util.ArrayList;

public class Toneelgezelschap extends Artiest {
    private String naam;
    private int jaarOprichting;
    private ArrayList<Acteur> acteurs = new ArrayList<>();


    public Toneelgezelschap(String genre ,String naam, int jaarOprichting) {
        super(genre);
        this.naam = naam;
        this.jaarOprichting = jaarOprichting;
    }

    public void voegActeurToe(Acteur acteur) {
        acteurs.add(acteur);
    }

    @Override
    public String krijgnaam() {
        return naam;
    }

    public int getJaarOprichting() {
        return jaarOprichting;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" oprichtingsjaar: ");
        sb.append(jaarOprichting);
        sb.append("\n Acteurs: ");
        for (Acteur acteur : acteurs) {
            sb.append(acteur);
            sb.append(" ");
        }
        return sb.toString();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
