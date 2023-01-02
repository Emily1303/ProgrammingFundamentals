package textProcessingExercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputLine = input.split(", ");
        for (String item : inputLine) {
            if (isLengthValid(item) && isTheContentValid(item)) {
                System.out.println(item);
            }
        }
    }

    private static boolean isLengthValid(String item) {
        if (item.length() >= 3 && item.length() <= 16) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isTheContentValid(String item) {
        for (char symbol : item.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }

        return true;
    }
}
