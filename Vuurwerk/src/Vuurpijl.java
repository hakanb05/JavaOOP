public class Vuurpijl extends Vuurwerk{

    private double hoogte;
    private int[] kleurverhouding;


    public Vuurpijl(String naam, double prijs, double hoogte, int[] kleurverhouding, Instructie instructie) {
        super(naam, prijs, instructie);
        this.hoogte = hoogte;
        this.kleurverhouding = kleurverhouding;
    }

    @Override
    public boolean isLegaal() {
        if (super.isLegaal() && super.getInstructieLeeftijd() >= 16) {
            return true;
        } else {
            return false;
        }
    }

    private boolean correcteKleurverhouding(int[] kleurverhouding) {
        if( kleurverhouding[0] + kleurverhouding[1] + kleurverhouding[2] != 100) {
            System.out.println("Fout Kleur wordt op rood gezet.");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!correcteKleurverhouding(kleurverhouding)) {
            kleurverhouding = new int[]{100,0,0};
        }
        sb.append(super.toString()).append("\n\tKleuren:\n\t\tRood:").append(kleurverhouding[0]).append("\n\t\tGroen: ").append(kleurverhouding[1]);
        sb.append("\n\t\tBlauw: ").append(kleurverhouding[2]);
        return sb.toString();
    }
}
