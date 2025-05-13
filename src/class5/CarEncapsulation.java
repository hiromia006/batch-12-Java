package class5;

public class CarEncapsulation {
    private String model;
    private int speed;

    public CarEncapsulation() {

    }

    public CarEncapsulation(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        CarEncapsulation car = new CarEncapsulation("Toyota", 120);
        car.displayInfo();

        // Accessing private fields using getters and setters
        car.setModel("Honda");
        car.setSpeed(150);
        System.out.println("Updated Car Model: " + car.getModel());
        System.out.println("Updated Car Speed: " + car.getSpeed() + " km/h");

        System.out.println("---------------------------------");
        CarEncapsulation car2 = new CarEncapsulation();
        car2.setModel("BMW");
        car2.setSpeed(200);
        System.out.println("Car 2 Model: " + car2.getModel());
        System.out.println("Car 2 Speed: " + car2.getSpeed() + " km/h");
    }
}
