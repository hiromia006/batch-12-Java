package class6.generic;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(100);
        integers.add(200);
        integers.add(300);

        for (Integer i : integers) {// for each loop
            System.out.println(i);
        }

        System.out.println(integers.get(0));



    }
}
