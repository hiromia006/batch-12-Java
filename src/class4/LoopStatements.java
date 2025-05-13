package class4;

public class LoopStatements {
    public static void main(String[] args) {
//        // for loop
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("For loop iteration: " + i);
//        }
//        // decrementing for loop
//
//        for (int i = 10; i >= 0; i--) {
//            System.out.println("Decrementing for loop iteration: " + i);
//        }

        // Extend for loop
//        int []numbers = {1, 2, 3, 4, 5};
//        for (int a : numbers) {
//            System.out.println("Extended for loop iteration: " + a);
//        }

        String [] names = {"John", "Jane", "Doe"};
        for (String b : names) {
            System.out.println("Extended for loop iteration: " + b);
        }


////        // while loop
//        int j = 1;
//        while (j <= 5) {
//            System.out.println("While loop iteration: " + j);
//            j++;
//        }
////
////        // do-while loop
//        int k = 1;
//        do {
//            System.out.println("Do-while loop iteration: " + k);
//            k++;
//        } while (k <= 5);
//
//        // break statement
//        for (int l = 1; l <= 10; l++) {
//            if (l == 6)  break;
//            System.out.println("Break statement iteration: " + l);
//        }
//
//        // continue statement
        for (int m = 1; m <= 10; m++) {
            if (m == 6) {
                continue; // Skip the iteration when m is 6
            }
            System.out.println("Continue statement iteration: " + m);
        }

        //
    }
}
