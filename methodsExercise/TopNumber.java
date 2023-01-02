package methodsExercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            int sumOfDigits = sumOfAllDigitsOfTheNumber(i);
            boolean divisibleBy8 = false;
            if (sumOfDigits % 8 == 0) {
                divisibleBy8 = true;
            }

            boolean isThereOneOddDigit = isThereAtLeastOneOddDigit(i);
            if (isThereOneOddDigit && divisibleBy8) {
                System.out.println(i);
            }
        }
    }

    private static int sumOfAllDigitsOfTheNumber(int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }

        return sum;
    }

    private static boolean isThereAtLeastOneOddDigit(int num) {
        boolean isTrue = false;
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 != 0) {
                isTrue = true;
                break;
            } else {
                num = num / 10;
            }
        }

        return isTrue;
    }
}
