package class6.generic;

public class GenericTest {
    public static void main(String[] args) {
        Generic<Integer> intTest = new Generic<>(10);
        System.out.println("Integer value: " + intTest.getValue());

        Generic<String> strTest = new Generic<>("Hello");
        System.out.println("String value: " + strTest.getValue());

        Generic<Long> longTest = new Generic<>(100L);
        System.out.println("Long value: " + longTest.getValue());

        Generic<Double> doubleTest = new Generic<>(10.5);
        System.out.println("Double value: " + doubleTest.getValue());

        Generic<Float> floatGeneric= new Generic<>(10.5f);
        System.out.println("Float value: " + floatGeneric.getValue());


    }
}
