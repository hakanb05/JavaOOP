public class Vuurwerk extends Product{

    private Instructie instructie;

    public Vuurwerk(String naam, double prijs, Instructie instructie) {
        super(naam, prijs);
        this.instructie = instructie;
    }


    public int getInstructieLeeftijd() {
        return instructie.getLeeftijd();
    }

    public Instructie getInstructie() {
        return instructie;
    }

    public boolean getNederlandstalig() {
        return instructie.isNederlandstalig();
    }

    public Vuurwerk(String naam, double prijs) {
        this(naam,prijs, null);
    }

    @Override
    public boolean isLegaal() {
        if (instructie != null && instructie.isNederlandstalig()) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        naam = super.naam;
        prijs = super.prijs;
        sb.append("Naam: ").append(naam).append("\n\tPrijs: ").append(prijs).append("\n\tInstructie: ");
        if (instructie == null) {
            sb.append("Ontbreekt");
        } else {
            sb.append(instructie);
        }
        sb.append("\n\tLegaal: ").append(isLegaal());
        return sb.toString();
    }
}
