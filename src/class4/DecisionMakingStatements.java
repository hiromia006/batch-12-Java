package class4;

public class DecisionMakingStatements {
    public static void main(String[] args) {


        // if statement
//        if (number > 0) {
//            System.out.println("The number is positive.");
//        }

        // if-else statement
//        if (number % 2 == 0) {
//            System.out.println("The number is even.");
//        } else {
//            System.out.println("The number is odd.");
//        }

        int number = 90;
        // if-else if-else statement with multiple conditions using grading system
        if (number > 90 && number <= 100) {
            System.out.println("Grade: A");
        } else if (number >= 80 && number <= 90) {
            System.out.println("Grade: B");
        } else if (number >= 70 && number < 80) {
            System.out.println("Grade: C");
        } else if (number >= 60 && number < 70) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // switch statement
        int day = -3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

    }
}
