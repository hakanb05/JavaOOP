public class Werknemer extends Persoon {
    private int laatstePersoneelsnummer;
    private double maandsalaris;
    private int personeelsnummer;

    public Werknemer(double maandsalaris, String naam) {
        super(naam);
        this.maandsalaris = maandsalaris;
    }

    @Override
    public double berekenInkomsten() {
        return maandsalaris;
    }

}
