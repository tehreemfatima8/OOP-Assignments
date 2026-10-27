/*
 * File: Main.java
 * Name: <your name>        Seat No: <your seat no>
 */
public class Main {
    public static void main(String[] args) {
        String out = "factorial(5) = " + Recursion.factorial(5) + "\n";
        out += "gcd(48, 18)  = " + Recursion.gcd(48, 18) + "\n";
        out += "fib(4)       = " + Recursion.fib(4) + ", calls = " + Recursion.fibCalls(4) + "\n";

        try {
            Recursion.factorial(-1);
        } catch (IllegalArgumentException e) {
            out += "Blocked: " + e.getMessage() + "\n";
        }
        try {
            Recursion.badFactorial(5);
        } catch (StackOverflowError e) {
            out += "badFactorial(5) -> StackOverflowError (never reaches the base case)\n";
        }
        System.out.print(out);
    }
}