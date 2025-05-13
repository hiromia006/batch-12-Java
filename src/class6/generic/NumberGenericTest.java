package class6.generic;

public class NumberGenericTest {
    public static void main(String[] args) {
        NumberGeneric<Integer> intNumber = new NumberGeneric<>(10);
        System.out.println("Integer value: " + intNumber.getValue());

        NumberGeneric<Double> doubleNumber = new NumberGeneric<>(10.5);
        System.out.println("Double value: " + doubleNumber.getValue());

        NumberGeneric<Float> floatNumber = new NumberGeneric<>(10.5f);
        System.out.println("Float value: " + floatNumber.getValue());

        NumberGeneric<Long> longNumber = new NumberGeneric<>(100000L);
        System.out.println("Long value: " + longNumber.getValue());

        // Uncommenting the following line will cause a compile-time error
        // NumberGeneric<String> stringNumber = new NumberGeneric<>("Hello");
    }
}
