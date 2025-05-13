package class6.generic;

public class NumberGeneric<N extends Number> {
    private N value;

    public NumberGeneric(N value) {
        this.value = value;
    }

    public N getValue() {
        return value;
    }


}
