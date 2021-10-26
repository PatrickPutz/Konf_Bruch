public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    public Bruch(int numerator, int denominator) {
        // Set attributes of "Bruch"
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {
        // Return "Bruch" as its decimal value
        double numerator = this.numerator;
        double denominator = this.denominator;
        return numerator / denominator;
    }

    public String print() {
        // Return "Bruch" as text in form of "x / y"
        return this.numerator + " / " + this.denominator;
    }

    public Bruch multiplicate(Bruch b2) {
        /* TODO:
        *  Erstellen Sie für das Ergebnis eine neue Bruch-Variable
        *   => Übergeben Sie im Konstruktur für numerator den
        *       eigenen numerator multipliziert mit b2.getNumerator()
        *   => Selbige auch für denominator
        *  Retournieren Sie ihre neue Bruch-Variable
        * */


        return null;
    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {
        // TODO: Multiplizieren Sie den eigenen Bruch mit b2 und b3

        return null;
    }
}
