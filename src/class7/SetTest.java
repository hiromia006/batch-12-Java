package class7;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> set = Set.of(1, 2, 3, 4, 5);

        Set<Integer> integers = new HashSet<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
        integers.add(10);


        integers.addAll(set);
        integers.removeAll(set);

        for (Integer item : integers) {
            System.out.println(item);
        }

    }
}
