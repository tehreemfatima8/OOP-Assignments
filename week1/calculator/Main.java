public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        String out = "add(1,2,3,4)  = " + calc.add(1, 2, 3, 4) + "\n";
        out += "add()          = " + calc.add() + "\n";
        out += "divide(10,4)   = " + calc.divide(10, 4) + "\n";
        out += "modulus(10,3)  = " + calc.modulus(10, 3) + "\n";
        out += "modulus(-7,3)  = " + calc.modulus(-7, 3) + "   (edge: negative)\n";
        out += "power(2,10)    = " + calc.power(2, 10) + "\n";
        out += "power(5,0)     = " + calc.power(5, 0) + "   (edge: exponent 0)\n";

        try {
            calc.divide(10, 0);
        } catch (ArithmeticException e) {
            out += "divide(10,0)   -> " + e.getMessage() + "\n";
        }
        try {
            calc.modulus(10, 0);
        } catch (ArithmeticException e) {
            out += "modulus(10,0)  -> " + e.getMessage() + "\n";
        }
        try {
            calc.power(0, -1);
        } catch (ArithmeticException e) {
            out += "power(0,-1)    -> " + e.getMessage() + "\n";
        }
        System.out.print(out);
    }
}