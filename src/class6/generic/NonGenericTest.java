package class6.generic;

public class NonGenericTest {
    public static void main(String[] args) {
        IntegerTest intTest = new IntegerTest(10);
        System.out.println("Integer value: " + intTest.getIntegerValue());

        StringTest strTest = new StringTest("Hello");
        System.out.println("String value: " + strTest.getStringValue());

        LongTest longTest = new LongTest(100L);
        System.out.println("Long value: " + longTest.getLongValue());

        DoubleTest doubleTest = new DoubleTest(10.5);
        System.out.println("Double value: " + doubleTest.getDoubleValue());

    }
}
