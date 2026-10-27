/*
 * File: Point.java
 * Name: <your name>        Seat No: <your seat no>
 * Purpose: A 2D point. add() and subtract() return NEW points.
 */
public class Point {

    private double x;
    private double y;

    public Point() {                         // no-arg constructor: the origin
        this(0, 0);
    }

    public Point(double x, double y) {       // parameterized constructor
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {              // copy constructor
        if (other == null) {
            throw new IllegalArgumentException("Point must not be null.");
        }
        this.x = other.x;
        this.y = other.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // SAFE add: this and obj are not changed, the answer is a new Point
    public Point add(Point obj) {
        double newX = this.x + obj.x;
        double newY = this.y + obj.y;
        return new Point(newX, newY);
    }

    // this - obj gives a new Point holding (delX, delY)
    public Point subtract(Point obj) {
        return new Point(this.x - obj.x, this.y - obj.y);
    }

    public double distanceTo(Point obj) {
        Point d = this.subtract(obj);
        return Math.sqrt(d.x * d.x + d.y * d.y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}