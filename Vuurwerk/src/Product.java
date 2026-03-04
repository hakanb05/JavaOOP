public abstract class Product {
    /**
     * Symbool voor Euro-teken
     */
    public static final String EURO = "\u20AC";

    protected String naam;
    protected double prijs;

    public Product(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    public abstract boolean isLegaal();

    @Override
    public String toString() {
        return "Naam: " + naam + "\n"
                + "  Prijs: " + EURO + String.format("%.2f", prijs);
    }
}