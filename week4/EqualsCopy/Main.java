public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // ---- == vs equals vs hashCode ----
        Point p = new Point(10, 12);
        Point q = new Point(10, 12);
        String out = "p == q: " + (p == q) + ", p.equals(q): " + p.equals(q)
                   + ", same hashCode: " + (p.hashCode() == q.hashCode()) + "\n";

        // ---- shallow vs deep copy ----
        PointArray original = new PointArray();      // default points (1, 2) and (3, 4)
        PointArray shallow = original.clone();
        PointArray deep = original.deepCopy();

        shallow.getPoint(0).setX(99);                // shared Point, so original changes too
        deep.getPoint(1).setX(88);                   // own Point, so original is safe

        out += "original: " + original + "\n";
        out += "shallow : " + shallow + "\n";
        out += "deep    : " + deep + "\n";
        System.out.print(out);
    }
}