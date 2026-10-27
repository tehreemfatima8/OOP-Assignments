/*
 * File: Main.java
 * Name: <your name>        Seat No: <your seat no>
 */
public class Main {
    public static void main(String[] args) {
        Rational half = new Rational(1, 2);
        Rational third = new Rational(1, 3);

        String out = half + " + " + third + " = " + half.add(third) + "\n";
        out += "Rational(6, 8)  = " + new Rational(6, 8) + "\n";
        out += "Rational(6, -8) = " + new Rational(6, -8) + "\n";
        try {
            new Rational(1, 0);
        } catch (IllegalArgumentException e) {
            out += "Blocked: " + e.getMessage() + "\n";
        }
        System.out.print(out);
    }
}