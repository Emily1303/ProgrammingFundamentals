package methodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int multipliedSum = evenOrOddSum(number);
        System.out.println(multipliedSum);
    }

    public static int evenOrOddSum(int number) {
        int currentNumber = number;
        int digit = 0;
        int evenSum = 0;
        int oddSum = 0;
        while (currentNumber != 0) {
            digit = currentNumber % 10;
            if (digit % 2 == 0) {
                evenSum = evenSum + digit;
            } else {
                oddSum = oddSum + digit;
            }
            currentNumber = currentNumber / 10;
        }
        return evenSum * oddSum;
    }

}
