public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "Black", 50);   // parameterized constructor
        Car spare = new Car();                   // no-arg constructor

        bmw.startEngine();
        bmw.accelerate(60);
        bmw.enableTurbo();
        bmw.accelerate(200);                     // stops at the turbo limit
        bmw.drive(100);

        String out = "bmw   : " + bmw + "\n";
        out += "spare : " + spare + "\n";

        try {
            spare.accelerate(10);                // engine is off
        } catch (IllegalStateException e) {
            out += "Blocked: " + e.getMessage() + "\n";
        }
        try {
            new Car("", "Blue", 10);             // invalid brand
        } catch (IllegalArgumentException e) {
            out += "Blocked: " + e.getMessage() + "\n";
        }
        System.out.print(out);
    }
}