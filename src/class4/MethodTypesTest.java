package class4;

public class MethodTypesTest {
    private  String name;
    private int age;
    private String address;


    public MethodTypesTest() {

    }

    public MethodTypesTest(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;

    }

    public void printName() {
        System.out.println("Name: " + name);
    }

    public void printAge() {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Testing the default constructor
        MethodTypesTest defaultPerson = new MethodTypesTest();
//        defaultPerson.name="John Doe2";
//        defaultPerson.age = 30;
//        defaultPerson.address = "123 Main St";
        defaultPerson.printName(); // Should print null
        defaultPerson.printAge(); // Should print 0

        System.out.println("-----------------");

        MethodTypesTest person = new MethodTypesTest("John Doe2", 30, "123 Main St");
        person.printName();
        person.printAge();

        System.out.println("-----------------");
        // Testing the constructor
        MethodTypesTest anotherPerson = new MethodTypesTest("Jane Doe3", 25, "456 Elm St");
        anotherPerson.printName();
        anotherPerson.printAge();
    }
}
