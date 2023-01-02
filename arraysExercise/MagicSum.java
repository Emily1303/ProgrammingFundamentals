package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicNum = Integer.parseInt(scanner.nextLine());

        int currentNum = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            currentNum = numbers[i];
            if (i + 1 < numbers.length) {
                for (int j = i + 1; j < numbers.length; j++) {
                    sum = currentNum + numbers[j];
                    if (sum == magicNum) {
                        System.out.print(numbers[i] + " " + numbers[j]);
                        System.out.println();
                    }
                }
            }
        }
    }
}
