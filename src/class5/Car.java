package class5;

public class Car extends Vehicle{
    int year = 2022;

    void displayInfo() {
        System.out.println("Brand: " + brand); // inherited field
        System.out.println("Year: " + year);
    }
}
