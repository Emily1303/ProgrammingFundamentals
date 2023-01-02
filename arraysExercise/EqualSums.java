package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        boolean areEqual = false;
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                int leftNumber = numbers[j];
                leftSum = leftSum + leftNumber;
            }

            for (int j = i + 1; j < numbers.length; j++) {
                int rightNumber = numbers[j];
                rightSum = rightSum + rightNumber;
            }

            if (leftSum == rightSum) {
                areEqual = true;
                System.out.println(i);
                break;
            }
        }

        if (!areEqual) {
            System.out.println("no");
        }
    }
}
