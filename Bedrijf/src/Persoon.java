public abstract class Persoon {
    private String naam;

    public Persoon(String naam) {
        this.naam = naam;
    }

    public abstract double berekenInkomsten();

    public int compareTo(Persoon ander) {
        if (this.naam.compareTo(ander.naam) == 0) {
            return 0;
        } else if (this.naam.compareTo(ander.naam) > 0) {
            return 1;
        } else {
            return -1;
        }
    }

public String toString() {
   StringBuilder sb = new StringBuilder();
   sb.append(naam);
   return sb.toString();
}
}

