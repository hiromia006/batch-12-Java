package class7;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "cherry");

        List<String> name = new ArrayList<>();
        name.add("apple");
        name.add("Rima");
        name.add("Urmy");
        name.add("Rima");


        System.out.printf(name.get(1));
        name.remove(1);
        System.out.printf(name.get(1));

        System.out.printf("===============================================");
        name.addAll(list);
        for (String s : name) {
            System.out.println(s);
        }
    }
}
