public class PointArray implements Cloneable {

    private Point[] points;

    // no-arg constructor: calls the other constructor with default points
    public PointArray() {
        this(new Point[] { new Point(1, 2), new Point(3, 4) });
    }

    public PointArray(Point[] points) {
        if (points == null) {
            throw new IllegalArgumentException("Points must not be null.");
        }
        this.points = points;
    }

    public Point getPoint(int index) {
        if (index < 0 || index >= points.length) {
            throw new IndexOutOfBoundsException("Index " + index + " is not valid.");
        }
        return points[index];
    }

    // SHALLOW copy: same Point[] and same Points
    @Override
    public PointArray clone() throws CloneNotSupportedException {
        return (PointArray) super.clone();
    }

    // DEEP copy: new Point[] and a new Point for every element
    public PointArray deepCopy() throws CloneNotSupportedException {
        PointArray duplicate = (PointArray) super.clone();
        duplicate.points = new Point[this.points.length];
        for (int i = 0; i < this.points.length; i++) {
            duplicate.points[i] = new Point(this.points[i]);
        }
        return duplicate;
    }

    // calls Point.toString() for every element
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < points.length; i++) {
            result += points[i] + " ";
        }
        return result.trim();
    }
}