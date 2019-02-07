

public class Complexity {
    public static void main(String[] args) {

        Lex z1 = new Lex (2,3);
        Lex z2 = new Lex (3,7);

        Lex z3 = z1.addition(z2);
        System.out.println(z3);

        Lex z4 = z1.multiply(z2);
        System.out.println(z4);

        double v = z1.argument();
        System.out.println(v);

        v = z2.argument();
        System.out.println(v);

        if (z1.equals(z2)) {
            System.out.println("Like one another.");
        } else {
            System.out.println("Unlike one another.");
        }

        System.out.println(z1);
        System.out.println(z2);

    }
}
