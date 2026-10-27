
public class Player {
    private String name;
    private Dice[] dice;
    private int total;

    public Player(String name, int count, int sides) {
        this.name = name;
        dice = new Dice[count];
        total = 0;

        for (int i = 0; i < count; i++) {
            dice[i] = new Dice(sides);
        }
    }

    public void roll() {
        for (int i = 0; i < dice.length; i++) {
            total += dice[i].roll();
        }
    }

    public void roll(int index) {
        total += dice[index].roll();
    }

    public int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return name + "'s total is " + total;
    }
}
