package methodsExercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String newNumber = scanner.nextLine();
        while (!newNumber.equals("END")) {
            boolean isNumberPalindrome = isTheGivenNumberPalindrome(newNumber);
            if (isNumberPalindrome) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            newNumber = scanner.nextLine();
        }
    }

    private static boolean isTheGivenNumberPalindrome(String number) {
        char firstSymbol = number.charAt(0);
        char lastSymbol = number.charAt(number.length() - 1);
        if (firstSymbol == lastSymbol) {
            return true;
        } else {
            return false;
        }
    }
}
