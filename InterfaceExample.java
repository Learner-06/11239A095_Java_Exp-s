// Define an interface
interface Animal {
    void eat();   // method without body
    void sleep(); // method without body
}

// Class implementing the interface
class Dog implements Animal {
    // Must provide body for all interface methods
    public void eat() {
        System.out.println("Dog eats bones.");
    }

    public void sleep() {
        System.out.println("Dog sleeps in the kennel.");
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sleep();
    }
}
