package methodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minValue = Integer.MAX_VALUE;
        for (int i = 1; i <= 3; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            minValue = giveTheSmallestNumberOfThree(number, minValue);
        }

        System.out.println(minValue);
    }

    public static int giveTheSmallestNumberOfThree(int number, int minValue) {
        if (minValue > number) {
            minValue = number;
        }

        return minValue;
    }
}
