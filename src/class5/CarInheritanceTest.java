package class5;

public class CarInheritanceTest {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car();

        // Access the fields and methods of the Car class
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Year: " + myCar.year);

        myCar.honk();
        myCar.displayInfo();


    }
}
