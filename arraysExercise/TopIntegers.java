package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int count = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                int num = numbers[j];
                    if (number > num) {
                        count++;
                        if (count == numbers.length - (1 + i)) {
                            System.out.print(number + " ");
                        }
                    }
            }
            if (i == numbers.length - 1) {
                System.out.print(number + " ");
            }
        }
    }
}
