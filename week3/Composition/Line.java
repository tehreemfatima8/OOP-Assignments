/*
 * File: Line.java
 * Name: <your name>        Seat No: <your seat no>
 * Purpose: A Line HAS two Points (composition).
 */
public class Line {

    private final Point start;
    private final Point end;

    public Line() {                          // default line: both ends at (0, 0)
        this.start = new Point();
        this.end = new Point();
    }

    public Line(Point start, Point end) {    // parameterized, with input validation
        if (start == null || end == null) {
            throw new IllegalArgumentException("Start and end points are required.");
        }
        this.start = new Point(start);       // the Line keeps its own copies
        this.end = new Point(end);
    }

    public double length() {
        return start.distanceTo(end);
    }

    // where the two lines cross, or null if they are parallel
    public Point intersect(Line other) {
        double x1 = start.getX(), y1 = start.getY();
        double x2 = end.getX(), y2 = end.getY();
        double x3 = other.start.getX(), y3 = other.start.getY();
        double x4 = other.end.getX(), y4 = other.end.getY();

        double bottom = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        if (bottom == 0) {
            return null;
        }
        double a = x1 * y2 - y1 * x2;
        double b = x3 * y4 - y3 * x4;
        double x = (a * (x3 - x4) - (x1 - x2) * b) / bottom;
        double y = (a * (y3 - y4) - (y1 - y2) * b) / bottom;
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "Line[" + start + " -> " + end + "]";
    }
}