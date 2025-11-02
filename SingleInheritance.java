// Parent class
class Animal {
    void eat() {
        System.out.println("Animals eat food.");
    }
}

// Child class (inherits from Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Main class
public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();   // create object of child class
        d.eat();             // call parent class method
        d.bark();            // call child class method
    }
}
