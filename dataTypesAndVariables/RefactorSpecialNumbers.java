package dataTypesAndVariables;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        boolean isSpecialNumber = false;
        for (int i = 1; i <= number; i++) {
            int currentNumber = i;
            int sum = 0;
            while (currentNumber > 0) {
                sum += currentNumber % 10;
                currentNumber = currentNumber / 10;
            }
            isSpecialNumber = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecialNumber) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }

    }
}
