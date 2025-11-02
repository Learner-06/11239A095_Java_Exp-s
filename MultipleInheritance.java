// First interface
interface Animal {
    void eat();
}

// Second interface
interface Pet {
    void play();
}

// Class implementing both interfaces
class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog eats food.");
    }

    public void play() {
        System.out.println("Dog loves to play.");
    }
}

// Main class
public class MultipleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
    }
}
