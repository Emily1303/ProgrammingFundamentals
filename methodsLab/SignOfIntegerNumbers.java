package methodsLab;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());

        printSignOfNumber(numberInput);
    }

    public static void printSignOfNumber(int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}