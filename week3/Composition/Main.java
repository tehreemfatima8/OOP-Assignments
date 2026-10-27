public class Main {
    public static void main(String[] args) {
        // ---- Point: safe add, subtract ----
        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 5);
        Point result = p1.add(p2);

        String out = "p1 = " + p1 + ", p2 = " + p2 + "\n";
        out += "p1.add(p2) = " + result + "  (p1 is still " + p1 + ")\n";
        out += "p2.subtract(p1) = " + p2.subtract(p1) + "\n";
        out += "default Point() = " + new Point() + "\n";

        // ---- Line: composition, overloaded constructors, intersect ----
        Line l1 = new Line(new Point(0, 0), new Point(4, 4));
        Line l2 = new Line(new Point(0, 4), new Point(4, 0));
        Line l3 = new Line(new Point(0, 1), new Point(4, 5));
        out += l1 + " length = " + l1.length() + "\n";
        out += "l1 and l2 cross at " + l1.intersect(l2) + "\n";
        out += "l1 and l3 cross at " + l1.intersect(l3) + "  (parallel)\n";
        out += "default Line() = " + new Line() + "\n";

        // ---- Triangle: composition with 3 Points ----
        Triangle t = new Triangle(new Point(0, 0), new Point(4, 0), new Point(0, 3));
        out += t + "\n";
        out += "area = " + t.area() + ", perimeter = " + t.perimeter() + "\n";

        try {
            new Line(new Point(0, 0), null);
        } catch (IllegalArgumentException e) {
            out += "Blocked: " + e.getMessage() + "\n";
        }
        try {
            new Triangle(new Point(0, 0), new Point(1, 1), new Point(2, 2));
        } catch (IllegalArgumentException e) {
            out += "Blocked: " + e.getMessage() + "\n";
        }
        System.out.print(out);
    }
}