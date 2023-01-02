package methodsExercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isLengthEnough = isTheLengthOfCharactersEnough(password);
        if (!isLengthEnough) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isContentValid = isPasswordConsistsOnlyOfLettersAndDigits(password);
        if (!isContentValid) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isNumberOfDigitsValid = isThereTwoOrMoreDigits(password);
        if (!isNumberOfDigitsValid) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isLengthEnough && isContentValid && isNumberOfDigitsValid) {
            System.out.println("Password is valid");
        }

    }

    private static boolean isTheLengthOfCharactersEnough(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isPasswordConsistsOnlyOfLettersAndDigits(String password) {
        boolean isTheRuleValid = false;
        for (char symbol : password.toCharArray()) {
            if (Character.isLetterOrDigit(symbol)) {
                isTheRuleValid = true;
            } else {
                isTheRuleValid = false;
                break;
            }
        }

        return isTheRuleValid;
    }

    private static boolean isThereTwoOrMoreDigits(String password) {
        int countOfDigits = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                countOfDigits++;
            }
        }

        boolean areDigitsEnough = false;
        if (countOfDigits >= 2) {
            areDigitsEnough = true;
        }

        return areDigitsEnough;
    }
}
