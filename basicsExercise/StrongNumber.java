package basicsExercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int startNumber = number;
        while (number > 0) {
            int factorial = 1;
            int digit = number % 10;
            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }

            number = number / 10;
            sum = sum + factorial;
        }

        if (startNumber == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
