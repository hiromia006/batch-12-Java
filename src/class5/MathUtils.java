package class5;

public class MathUtils {
    private int a;
    private int b;

    public MathUtils() {
        this.a = 10;
        this.b = 20;
    }
    public MathUtils(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void printSum() {
        System.out.println("Sum: " + (a + b));
    }

    public void printSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public void printSum(int a, int b, int c) {
        System.out.println("Sum: " + (a + b+c));
    }

    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();
        mathUtils.printSum();

        MathUtils mathUtils2 = new MathUtils(5, 15);
        mathUtils2.printSum();
    }
}
