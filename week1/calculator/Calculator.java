public class Calculator {

    public double add(double... numbers) {      // varargs: any number of values
        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        return total;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public double modulus(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot take modulus by zero.");
        }
        return a % b;
    }

    public double power(double base, double exponent) {
        if (base == 0 && exponent < 0) {
            throw new ArithmeticException("Zero cannot have a negative power.");
        }
        return Math.pow(base, exponent);
    }
}