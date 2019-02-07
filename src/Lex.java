public class Lex {

    double a;
    double b;
    int i;

    public Lex(double a, double b) {

        this.a = a;
        this.b = b;

    }

    public Lex addition(Lex z2) {

        double a = this.a + z2.a;
        double b = this.b + z2.b;
        Lex z3 = new Lex(a, b);
        return z3;

    }

    public Lex multiply(Lex z2) {

        double a = this.a * z2.a;
        double b = this.b * z2.b;
        Lex z4 = new Lex(a, b);
        return z4;

    }

    public double argument() {

        double v = Math.atan(this.b / this.a);
        return v;

    }

    public boolean equals(Lex z2) {

        if (this.a == z2.a && this.b == z2.b) {
            return true;
        } else {
            return false;
        }

    }

    public String toString() {

        return "Complex point is at: (" + this.a + "," + this.b + "i" + ")";

    }


}
