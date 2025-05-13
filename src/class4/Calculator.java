package class4;

public class Calculator {
    private int number1;
    private int number2;

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void printSum() {
        System.out.println("Sum: " + (number1 + number2));
    }

    public void printDifference(int a, int b) {
        System.out.println("Difference: " + (a - b));
    }

    public int getSum() {
        return number1 + number2;
    }

    public double getDivide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        // Testing the default constructor
        Calculator calculator = new Calculator(10, 5);
        calculator.printSum();
        calculator.printDifference(10, 5);

        // Testing the getSum method
        int sum = calculator.getSum();
        System.out.println("Sum from getSum1: " + sum);

        System.out.println("Sum from getSum2: " + calculator.getSum());

        System.out.println("-----------------");

        // Testing the getDivide method
        double divide = calculator.getDivide(10, 2);
        System.out.println("Division result: " + divide);
    }
}
