import org.junit.jupiter.api.Assertions;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * <p>
     * The following code is supposed to do a factorial of the number five, which looks like this: 5*4*3*2*1 = 120
     * <p>
     * Find and fix the error using the debugger
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        int number = 5;
        int factorial = calculateFactorial(number);
        Assertions.assertEquals(120, factorial);
        System.out.println("Il fattoriale di " + number + " è " + factorial);
    }

    private static int calculateFactorial(int number) {
        int result = 1;
        for (int i = number; i > 1; i--) {
            result *= i;
        }
        return result;
    }


    /**
     * 2:
     * <p>
     * The following code is supposed to reverse a string
     * <p>
     * Find and fix the error using the debugger
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        String input = "hello";
        String reversedString = reverseString(input);
        Assertions.assertEquals("olleh", reversedString);
        System.out.println("Reversed string: " + reversedString);
    }

    private static String reverseString(String input) {
        //Fix this code

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;

    }

    /**
     * 3:
     * <p>
     * The following code is supposed to check if a number is positive or negative
     * but there is a semantic error in the if statement.
     * <p>
     * Find and fix the error using the debugger
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Assertions.assertFalse(isPositive(-5));
        Assertions.assertFalse(isPositive(-55));
        Assertions.assertFalse(isPositive(0));
        Assertions.assertTrue(isPositive(5));
        Assertions.assertTrue(isPositive(55));
        Assertions.assertTrue(isPositive(4567));
        System.out.println("-5 is positive: " + isPositive(-5));
        System.out.println("-55 is positive: " + isPositive(-55));
        System.out.println("0 is positive: " + isPositive(0));
        System.out.println("5 is positive: " + isPositive(5));
        System.out.println("55 is positive: " + isPositive(55));
        System.out.println("4567 is positive: " + isPositive(4567));
    }

    private static boolean isPositive(int num) {
        return num > 0;
    }
}
