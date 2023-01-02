package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int evenSum = 0;
        int oddSum = 0;
//        for (int item : numbers) {
//            if (item % 2 == 0) {
//                evenSum = evenSum + item;
//            } else {
//                oddSum = oddSum + item;
//            }
//        }

        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 == 0) {
                evenSum = evenSum + currentNumber;
            } else {
                oddSum = oddSum + currentNumber;
            }
        }

        int diff = evenSum - oddSum;
        System.out.println(diff);
    }
}
