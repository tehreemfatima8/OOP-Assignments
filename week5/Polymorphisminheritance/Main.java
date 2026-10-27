public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();

        // Overriding
        d.sound();

        // Overloading
        d.eat();
        d.eat("meat");

        // Upcasting
        Animal a = new Dog();
        a.sound();

        // Downcasting
        Dog d2 = (Dog) a;
        d2.bark();
    }
}
