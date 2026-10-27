/*
 * File: Triangle.java
 * Name: <your name>        Seat No: <your seat no>
 * Purpose: A Triangle HAS three Points A, B and C (composition).
 */
public class Triangle {

    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        if (a == null || b == null || c == null) {
            throw new IllegalArgumentException("All three points are required.");
        }
        this.a = new Point(a);
        this.b = new Point(b);
        this.c = new Point(c);
        if (area() == 0) {
            throw new IllegalArgumentException("The three points are in a straight line.");
        }
    }

    public double perimeter() {
        return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
    }

    // half of the cross product of AB and AC (0 means a straight line)
    public double area() {
        Point ab = b.subtract(a);
        Point ac = c.subtract(a);
        return Math.abs(ab.getX() * ac.getY() - ab.getY() * ac.getX()) / 2;
    }

    @Override
    public String toString() {
        return "Triangle[A=" + a + ", B=" + b + ", C=" + c + "]";
    }
}