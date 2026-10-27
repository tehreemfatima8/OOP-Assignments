
public class Dice {
    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll() {
        return 1 + (int)(Math.random() * sides);
    }

    @Override
    public String toString() {
        return sides + "-sided dice";
    }
}
