public class Zzper extends Persoon implements Oproepbaar{

    private double uurtarief;
    private int urenGewerkt;

    public Zzper(double uurtarief, String naam) {
        super(naam);
        this.uurtarief = uurtarief;
    }

    @Override
    public void huurIn(int uren) {
        urenGewerkt = uren;
    }

    @Override
    public double berekenInkomsten() {
        return uurtarief * urenGewerkt;
    }
}
