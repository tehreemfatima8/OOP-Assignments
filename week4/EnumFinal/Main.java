enum Day { MON, TUE, SAT, SUN }

public class Main {

    static String type(Day d) {
        switch (d) {
            case SAT:
            case SUN:
                return "Weekend";
            default:
                return "Weekday";
        }
    }

    static String flow(boolean fail) {
        String log = "";
        try {
            log += "try ";
            if (fail) {
                throw new IllegalStateException("error");
            }
        } catch (IllegalStateException e) {
            log += "catch ";
        } finally {
            log += "finally";           // always runs
        }
        return log;
    }

    public static void main(String[] args) {
        final int MAX = 10;             // cannot be reassigned
        String out = "";
        for (Day d : Day.values()) {
            out += d + "=" + type(d) + " ";
        }
        out += "\nMAX=" + MAX + "\n";
        out += "no error  : " + flow(false) + "\n";
        out += "with error: " + flow(true) + "\n";
        System.out.print(out);
    }
}