/*
 * File: Recursion.java
 * Name: <your name>        Seat No: <your seat no>
 * Purpose: Methods that call themselves.
 */
public class Recursion {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must not be negative.");
        }
        if (n <= 1) {
            return 1;                        // base case: stops the recursion
        }
        return n * factorial(n - 1);         // smaller problem
    }

    // Euclid: gcd(a, b) = gcd(b, a % b), stops when b is 0
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    // how many times fib() is called for a given n
    public static int fibCalls(int n) {
        if (n <= 1) {
            return 1;
        }
        return 1 + fibCalls(n - 1) + fibCalls(n - 2);
    }

    // WRONG on purpose: n-- sends the OLD value, so n never gets smaller
    public static long badFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * badFactorial(n--);
    }
}