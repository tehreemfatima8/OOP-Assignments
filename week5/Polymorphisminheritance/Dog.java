public class Dog extends Animal {

    // Overriding
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    // Overloading
    public void eat(String food) {
        System.out.println("Dog eats " + food);
    }

    public void bark() {
        System.out.println("Woof Woof!");
    }
}
