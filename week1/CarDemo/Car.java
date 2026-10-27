public class Car {

    private static final int MAX_SPEED = 180;
    private static final int TURBO_MAX_SPEED = 220;
    private static final double FUEL_PER_KM = 0.1;

    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;
    private double fuelLevel;
    private boolean turboOn;

    // no-arg constructor: a valid default car
    public Car() {
        this("Unknown", "Unpainted", 0);
    }

    // parameterized constructor: valid object or exception
    public Car(String brand, String color, double fuelLevel) {
        if (brand == null || brand.isBlank()) {
            throw new IllegalArgumentException("Brand must not be empty.");
        }
        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException("Color must not be empty.");
        }
        if (fuelLevel < 0) {
            throw new IllegalArgumentException("Fuel must not be negative.");
        }
        this.brand = brand;
        this.color = color;
        this.fuelLevel = fuelLevel;
        this.speed = 0;
        this.engineOn = false;
        this.turboOn = false;
    }

    public void startEngine() {
        if (fuelLevel <= 0) {
            throw new IllegalStateException(brand + " has no fuel.");
        }
        engineOn = true;
    }

    public void stopEngine() {
        speed = 0;                 // rule: speed resets
        engineOn = false;
        turboOn = false;
    }

    public void accelerate(int amount) {
        if (!engineOn) {
            throw new IllegalStateException(brand + " engine is off.");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }
        int limit = turboOn ? TURBO_MAX_SPEED : MAX_SPEED;
        speed = Math.min(speed + amount, limit);
    }

    public void brake(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }
        speed = Math.max(0, speed - amount);   // rule: never negative
    }

    public void drive(double km) {
        if (!engineOn || speed == 0) {
            throw new IllegalStateException(brand + " must be running and moving.");
        }
        double needed = km * FUEL_PER_KM;
        if (km <= 0 || needed > fuelLevel) {
            throw new IllegalArgumentException("Invalid distance or not enough fuel.");
        }
        fuelLevel = fuelLevel - needed;
    }

    public void refuel(double litres) {
        if (litres <= 0) {
            throw new IllegalArgumentException("Litres must be positive.");
        }
        fuelLevel = fuelLevel + litres;
    }

    // creative feature
    public void enableTurbo() {
        if (!engineOn) {
            throw new IllegalStateException("Start the engine before using turbo.");
        }
        turboOn = true;
    }

    @Override
    public String toString() {
        return String.format("%s %s | speed=%d | engine=%s | fuel=%.1f | turbo=%s",
                brand, color, speed, engineOn ? "ON" : "OFF", fuelLevel, turboOn ? "ON" : "OFF");
    }
}