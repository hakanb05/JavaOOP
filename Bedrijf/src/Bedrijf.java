import java.util.ArrayList;

public class Bedrijf {
    private String naam;

    public String getNaam() {
        return naam;
    }

    private ArrayList<Persoon> medewerkers = new ArrayList<>();

    public Bedrijf(String naam) {
        this.naam = naam;
    }

    public void neemInDienst(Persoon persoon) {
        medewerkers.add(persoon);
    }

    public int aantalManagers() {
        int totalManager = 0;

        for (int i = 0; i < medewerkers.size(); i++) {
            if (medewerkers.get(i) instanceof Manager) {
                totalManager++;
            }
        }

        return totalManager;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bedrijf ");
        sb.append(naam);
        sb.append(" heeft ");
        sb.append(medewerkers.size());
        sb.append(" medewerkers\n  ");

        for (int i = 0; i < medewerkers.size(); i++) {
            sb.append(medewerkers.get(i));
            sb.append("\n  ");
        }

        return sb.toString();
    }

    public void  printInkomsten() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Inkomsten van alle personen:\n  ");

        for (int i = 0; i < medewerkers.size(); i++) {
            medewerkers.sort(Persoon::compareTo);
            sb.append(medewerkers.get(i).toString());
            sb.append(" inkomsten: ");
            sb.append(medewerkers.get(i).berekenInkomsten());
            sb.append("\n  ");
        }

        System.out.println(sb.toString());
    }

}
