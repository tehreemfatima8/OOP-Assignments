
public class Main {
    public static void main(String[] args) {
        Player p = new Player("Sara", 2, 6);

        p.roll();
        System.out.println("Total after rolling both dice: "
                           + p.getTotal());

        p.roll(0);
        System.out.println("Total after rolling one more die: "
                           + p.getTotal());

        System.out.println(p);
    }
}
