package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rotation = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotation; i++) {
            int firstNum = numbers[0];
            for (int j = 0; j < numbers.length; j++) {
                if (j + 1 < numbers.length) {
                    numbers[j] = numbers[j + 1];
                }
            }
            numbers[numbers.length - 1] = firstNum;
        }

        for (int item : numbers) {
            System.out.print(item + " ");
        }
    }
}
