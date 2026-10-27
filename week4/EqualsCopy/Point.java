import java.util.Objects;

/*
 * File: Point.java
 * Name: <your name>        Seat No: <your seat no>
 * Purpose: Point with equals(Object), hashCode() and a copy constructor.
 */
public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {                       // copy constructor
        if (other == null) {
            throw new IllegalArgumentException("Point must not be null.");
        }
        this.x = other.x;
        this.y = other.y;
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    @Override
    public boolean equals(Object obj) {               // overrides Object.equals
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point other = (Point) obj;
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public int hashCode() {                           // same fields as equals
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}