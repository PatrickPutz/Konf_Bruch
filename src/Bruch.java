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
        // Multiply current object of "Bruch" with another object of "Bruch"
        // and return a new object of "Bruch"
        Bruch multiplicate = new Bruch
                (this.numerator * b2.getNumerator(), this.denominator * b2.getDenominator());
        return multiplicate;
    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {
        // Multiply current object of "Bruch" with two additonal objects of "Bruch"
        // and return a new object of "Bruch"
        Bruch multiplicate = new Bruch
                (this.numerator * b2.getNumerator() * b3.getNumerator(),
                        this.denominator * b2.getDenominator() * b3.getDenominator());
        return multiplicate;
    }
}
