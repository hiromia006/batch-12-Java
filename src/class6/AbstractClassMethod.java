package class6;

public class AbstractClassMethod {
    public static void main(String[] args) {
        //Animal al=new Animal()
        Dog dg = new Dog();
        dg.makeSound();
        dg.sleep();

        System.out.println("==============================");
        Animal al = new Dog();
        al.makeSound();
        al.sleep();
    }
}
