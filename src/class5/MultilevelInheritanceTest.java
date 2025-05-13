package class5;

public class MultilevelInheritanceTest {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bark(); // Calling the method from the Dog class
        myDog.eat(); // Calling the method from the Mammal class
        myDog.walk();

    }
}
