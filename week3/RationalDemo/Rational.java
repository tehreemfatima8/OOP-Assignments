public class Rational {

    private final int numerator;
    private final int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator must not be zero.");
        }
        if (denominator < 0) {                 // keep the minus sign on top
            numerator = -numerator;
            denominator = -denominator;
        }
        int g = gcd(Math.abs(numerator), denominator);
        this.numerator = numerator / g;        // reduce to lowest terms
        this.denominator = denominator / g;
    }

    // a/b + c/d = (ad + cb) / bd, returned as a NEW Rational
    public Rational add(Rational other) {
        return new Rational(this.numerator * other.denominator + other.numerator * this.denominator,
                            this.denominator * other.denominator);
    }

    // Euclid: gcd(a, b) = gcd(b, a % b)
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}